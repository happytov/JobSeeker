package com.employeefinder.real.dao;

import com.employeefinder.real.model.JobSeeker;

import java.util.UUID;

public interface JobSeekerDao {
    // insert jobSeeker with given id
    int insertJobSeeker(UUID id, JobSeeker jobSeeker);
    // insert jobSeeker and generate id for them
    default int insertJobSeeker(JobSeeker jobSeeker){
        UUID id = UUID.randomUUID();
        return insertJobSeeker(id, jobSeeker);
    }
}
