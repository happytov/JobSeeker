package com.employeefinder.real.service;

import com.employeefinder.real.dao.JobSeekerDao;
import com.employeefinder.real.model.JobSeeker;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class JobSeekerService {
    private final JobSeekerDao jobSeekerDao;
    // use @Qualifier to distinquish among different repositories, list, MongoDb, etc
    // use matching @Qualifier next to @Repository("DBList") in dao
    @Autowired
    public JobSeekerService(@Qualifier("DBList")JobSeekerDao jobSeekerDao){
        this.jobSeekerDao = jobSeekerDao;
    }
    public int insertJobSeeker(JobSeeker jobSeeker){
        return jobSeekerDao.insertJobSeeker(jobSeeker);
    }
}
