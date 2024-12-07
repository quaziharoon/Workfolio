

package com.haroon.workfolio_server.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.haroon.workfolio_server.entity.Job;
import com.haroon.workfolio_server.entity.User;
import com.haroon.workfolio_server.model.JobCreateDTO;
import com.haroon.workfolio_server.service.JobService;
import com.haroon.workfolio_server.service.UserService;


@CrossOrigin(origins = "*")
@RestController
@RequestMapping(value = "/api/jobs", produces = MediaType.APPLICATION_JSON_VALUE)
public class JobController {
    private final JobService jobService;

    public JobController(final JobService jobService) {
        this.jobService = jobService;
    }

    @GetMapping("")
    public ResponseEntity<List<Job>> allJobs() {
        System.out.println("hi");
        List <Job> jobs = jobService.allJobs();
        System.out.println(jobs);
        return new ResponseEntity<>(jobs, HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<Job> addJob(@RequestBody JobCreateDTO jobCreateDTO) {
        Job createdJob = jobService.addJob(jobCreateDTO);
        return new ResponseEntity<>(createdJob, HttpStatus.CREATED);
    }
}
