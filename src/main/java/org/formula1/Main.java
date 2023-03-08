package org.formula1;

import org.formula1.data.Car;
import org.formula1.data.RaceManagement;
import org.formula1.data.Team;
import org.formula1.data.employees.CrewMember;
import org.formula1.data.employees.CrewMemberType;
import org.formula1.data.employees.Driver;
import org.formula1.data.employees.DriverExperienceLevel;


public class Main {
    public static void main(String[] args) {

        Team team = new Team();

        Driver beginnerDriver = new Driver("John", 22, DriverExperienceLevel.BEGINNER);
        Driver mediumDriver = new Driver("Paul", 26, DriverExperienceLevel.MEDIUM);
        Driver expertDriver = new Driver("Daniel", 32, DriverExperienceLevel.EXPERT);

        CrewMember pitCrewMember1 = new CrewMember("A", 43, CrewMemberType.PIT_CREW);
        CrewMember pitCrewMember2 = new CrewMember("B", 33, CrewMemberType.PIT_CREW);
        CrewMember pitCrewMember3 = new CrewMember("C", 23, CrewMemberType.PIT_CREW);
        CrewMember pitCrewMember4 = new CrewMember("D", 53, CrewMemberType.PIT_CREW);
        CrewMember engineerCrewMember1 = new CrewMember("Carlos", 41, CrewMemberType.ENGINEER);
        CrewMember engineerCrewMember2 = new CrewMember("Coolio", 37, CrewMemberType.ENGINEER);

        Car car1 = new Car();
        Car car2 =new Car();

        team.addCars(car1, car2);
        team.addEmployee(beginnerDriver, mediumDriver, expertDriver, pitCrewMember1, pitCrewMember2, pitCrewMember3, pitCrewMember4, engineerCrewMember1, engineerCrewMember2);

        RaceManagement raceManagement = new RaceManagement(team, 22, 2, 5);
        RaceManagementService raceManagementService = new RaceManagementService();
        System.out.println(raceManagementService.calculateTotalNetProfitOfTheYear(raceManagement));

    }
}