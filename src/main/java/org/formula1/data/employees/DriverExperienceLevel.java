package org.formula1.data.employees;

public enum DriverExperienceLevel {

    BEGINNER (20_000),
    MEDIUM (40_000),
    EXPERT (100_000);

    private int payPerRace;

    DriverExperienceLevel(int payPerRace) {
        this.payPerRace = payPerRace;
    }

    public int getPayPerRace() {
        return payPerRace;
    }
}
