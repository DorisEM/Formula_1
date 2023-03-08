package org.formula1.data.employees;

public class Driver extends Employee {

    private DriverExperienceLevel driverExperienceLevel;

    public Driver(String name, int age, DriverExperienceLevel driverExperienceLevel) {
        super(name, age);
        this.driverExperienceLevel = driverExperienceLevel;
    }

    public DriverExperienceLevel getDriverExperienceLevel() {
        return driverExperienceLevel;
    }

    @Override
    public String toString() {
        return "Driver{" +
                "driverExperienceLevel=" + driverExperienceLevel +
                "} " + super.toString();
    }
}
