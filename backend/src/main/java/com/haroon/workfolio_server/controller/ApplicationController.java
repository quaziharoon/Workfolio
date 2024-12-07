package com.haroon.workfolio_server.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.haroon.workfolio_server.entity.Application;
import com.haroon.workfolio_server.model.ApplicationDetailsDto;
import com.haroon.workfolio_server.service.ApplicationService;

import java.util.List;

@RestController
@RequestMapping("/api/applications")
public class ApplicationController {
    @Autowired
    private ApplicationService applicationService;

    @PostMapping
    public Application applyToJob(@RequestBody Application application) {
        return applicationService.applyToJob(application);
    }


    @GetMapping("/user/{userId}")
    public List<Application> getApplicationsByUser(@PathVariable Long userId) {
        return applicationService.getApplicationsByUser(userId);
    }

    @GetMapping("/details")
    public List<ApplicationDetailsDto> getApplicationDetails() {
        return applicationService.getAllApplicationDetails();
    }
}

