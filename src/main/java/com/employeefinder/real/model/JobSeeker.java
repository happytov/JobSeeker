package com.employeefinder.real.model;

import java.util.UUID;

public class JobSeeker {
    private final UUID id;
    private final String name;
    private final String jobTitle;
    private final int yearsExperience;
    private final Enum bestSkill;
    private final Enum bestTrait;

    public UUID getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public int getYearsExperience() {
        return yearsExperience;
    }

    public Enum getBestSkill() {
        return bestSkill;
    }

    public Enum getBestTrait() {
        return bestTrait;
    }

    public JobSeeker(UUID id, String name, String jobTitle, int yearsExperience, Enum bestSkill, Enum bestTrait) {
        this.id = id;
        this.name = name;
        this.jobTitle = jobTitle;
        this.yearsExperience = yearsExperience;
        this.bestSkill = bestSkill;
        this.bestTrait = bestTrait;
    }}


