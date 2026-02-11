package in.sj.entity;

import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;


@Data
@Entity(name="tbl_joblog")
public class JobLog {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	private Long id;
	@Column(name="jobName", nullable = false, length = 512)
	private String jobName;
	private LocalDateTime runTime;
	@Column(name = "status", nullable = false, length = 512 )
	private String status;
	
}
