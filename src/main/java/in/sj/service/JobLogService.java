package in.sj.service;

import java.time.LocalDateTime;

import org.springframework.stereotype.Service;

import in.sj.entity.JobLog;
import in.sj.repository.JobLogRepository;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class JobLogService {
	
	private final JobLogRepository repo;
	
	
	public void log(String jobName, String status) {
		JobLog log = new JobLog();
		log.setJobName(jobName);
		log.setRunTime(LocalDateTime.now());
		log.setStatus(status);
		repo.save(log);
	}
	
}
