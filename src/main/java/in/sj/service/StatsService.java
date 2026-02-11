package in.sj.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;
import in.sj.dto.JobStatsDto;
import in.sj.entity.JobLog;
import in.sj.repository.JobLogRepository;

@Service
@RequiredArgsConstructor
public class StatsService {

    private final JobLogRepository repo;

    public List<JobStatsDto> getJobStats() {

        List<JobStatsDto> result = new ArrayList<>();

        // 1. Get all job names
        List<String> jobNames = repo.findDistinctJobNames();

        // 2. For each job, calculate stats
        for (String jobName : jobNames) {

            long successCount = repo.countByJobNameAndStatus(jobName, "SUCCESS");
            long failedCount = repo.countByJobNameAndStatus(jobName, "FAILED");

            JobLog lastLog = repo.findTopByJobNameOrderByRunTimeDesc(jobName);

            JobStatsDto dto = new JobStatsDto();
            dto.setJobName(jobName);
            dto.setSuccessCount(successCount);
            dto.setFailedCount(failedCount);
            dto.setLastRunTime(lastLog != null ? lastLog.getRunTime() : null);

            result.add(dto);
        }

        return result;
    }
}
