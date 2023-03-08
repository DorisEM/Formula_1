package org.formula1.data.employees;

public class CrewMember extends Employee {

    private CrewMemberType crewMemberType;

    public CrewMember(String name, int age, CrewMemberType crewMemberType) {
        super(name, age);
        this.crewMemberType = crewMemberType;
    }

    public CrewMemberType getCrewMemberType() {
        return crewMemberType;
    }

}
