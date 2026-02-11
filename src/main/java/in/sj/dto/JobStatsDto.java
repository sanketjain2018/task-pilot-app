package in.sj.dto;

import java.time.LocalDateTime;

import lombok.Data;

@Data
public class JobStatsDto {
	
	
	private String jobName;
	private long successCount;
	private long failedCount;
	private LocalDateTime lastRunTime;
	
	
}
