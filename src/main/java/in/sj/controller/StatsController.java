package in.sj.controller;

import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import in.sj.dto.JobStatsDto;
import in.sj.service.StatsService;
import lombok.RequiredArgsConstructor;

@RestController

@RequestMapping("/api/stats")
@CrossOrigin(origins = "http://localhost:3000")
@RequiredArgsConstructor
public class StatsController {

    private final StatsService statsService;

    @GetMapping
    public List<JobStatsDto> getStats() {
        return statsService.getJobStats();
    }
    
    
}
