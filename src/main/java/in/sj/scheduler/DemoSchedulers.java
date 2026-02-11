package in.sj.scheduler;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import in.sj.service.JobLogService;
import lombok.RequiredArgsConstructor;

@Component
@RequiredArgsConstructor
public class DemoSchedulers {

	private final JobLogService service;

	// runs every 1 minite
	@Scheduled(fixedRate = 60000)
	public void retryJob() {
		try {
			// Simulate random failure
			if (Math.random() > 0.7) {
				throw new RuntimeException("Random failure in Retry Job");
			}

			// If no exception -> SUCCESS
			service.log("Retry Job", "SUCCESS");

		} catch (Exception e) {
			// If exception -> FAILED
			service.log("Retry Job", "FAILED");
		}
	}

	// runs 2 minites after previous execution finishes
	@Scheduled(fixedDelay = 120000)
	public void cleanupJob() {
		try {
			if (Math.random() > 0.8) {
				throw new RuntimeException("Random failure in Cleanup Job");
			}

			service.log("Cleanup Job", "SUCCESS");

		} catch (Exception e) {
			service.log("Cleanup Job", "FAILED");
		}
	}

	// runs every 5 minutes (cron)
	@Scheduled(cron = "${app.report.cron}")
	public void reportJob() {
		try {
			if (Math.random() > 0.6) {
				throw new RuntimeException("Random failure in Report Job");
			}

			service.log("Report Job", "SUCCESS");

		} catch (Exception e) {
			service.log("Report Job", "FAILED");
		}
	}

}
