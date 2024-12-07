package com.haroon.workfolio_server.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import com.haroon.workfolio_server.entity.Application;
import com.haroon.workfolio_server.model.ApplicationDetailsDto;
import com.haroon.workfolio_server.repos.ApplicationRepository;

import java.util.List;

@Service
public class ApplicationService {
    @Autowired
    private ApplicationRepository applicationRepository;

    public Application applyToJob(@RequestBody Application application) {
        return applicationRepository.save(application);
    }

    public List<Application> getApplicationsByUser(Long userId) {
        return applicationRepository.findBySeekerId(userId);
    }

    public List<ApplicationDetailsDto> getAllApplicationDetails() {
        return applicationRepository.findAllApplicationDetails();
    }
}
