package in.sj.controller;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.web.bind.annotation.*;

import lombok.RequiredArgsConstructor;
import in.sj.entity.JobLog;
import in.sj.repository.JobLogRepository;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
@RequestMapping("/api/logs")
@RequiredArgsConstructor
public class JobLogController {

    private final JobLogRepository repo;

    @GetMapping
    public Page<JobLog> getLogs(
            @RequestParam(defaultValue = "0") int page,
            @RequestParam(defaultValue = "10") int size,
            @RequestParam(required = false) String jobName,
            @RequestParam(required = false) String status
    ) {

        Pageable pageable = PageRequest.of(page, size, Sort.by("runTime").descending());

        if (jobName != null && status != null) {
            return repo.findByJobNameAndStatus(jobName, status, pageable);
        } else if (jobName != null) {
            return repo.findByJobName(jobName, pageable);
        } else if (status != null) {
            return repo.findByStatus(status, pageable);
        } else {
            return repo.findAll(pageable);
        }
    }
}
