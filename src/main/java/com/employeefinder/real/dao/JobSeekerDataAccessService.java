package com.employeefinder.real.dao;

import com.employeefinder.real.model.JobSeeker;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.UUID;
@Repository("DBList")
public class JobSeekerDataAccessService implements JobSeekerDao{
    private static ArrayList<JobSeeker> DB = new ArrayList<>();
    @Override
    public int insertJobSeeker(UUID id, JobSeeker jobSeeker){
        DB.add((new JobSeeker(id, jobSeeker.getName(), jobSeeker.getJobTitle(),
                jobSeeker.getYearsExperience(), jobSeeker.getBestSkill(),
                jobSeeker.getBestTrait())));
        return 1;
    }
}
