package in.sj.repository;


import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import in.sj.entity.JobLog;

public interface JobLogRepository extends JpaRepository<JobLog, Long> {
	

	
	 // Get all distinct job names
    @Query("select distinct j.jobName from tbl_joblog j")
    List<String> findDistinctJobNames();

    // Count by job name and status
    long countByJobNameAndStatus(String jobName, String status);

    // Get last run time for a job
    JobLog findTopByJobNameOrderByRunTimeDesc(String jobName);
    
    Page<JobLog> findByJobName(String jobName, Pageable pageable);

    Page<JobLog> findByStatus(String status, Pageable pageable);

    Page<JobLog> findByJobNameAndStatus(String jobName, String status, Pageable pageable);
}
