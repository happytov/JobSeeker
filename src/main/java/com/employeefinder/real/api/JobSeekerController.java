package com.employeefinder.real.api;

import com.employeefinder.real.model.JobSeeker;
import com.employeefinder.real.service.JobSeekerService;
import org.springframework.beans.factory.annotation.Autowired;

public class JobSeekerController {
    JobSeekerService jobSeekerService;
    @Autowired
    public void JobSeekerController(JobSeekerService jobSeekerService) {
        this.jobSeekerService = jobSeekerService;
    }
    public void insertJobSeeker(JobSeeker jobSeeker) {
        jobSeekerService.insertJobSeeker(jobSeeker);
    }
}
