package org.formula1;

import org.formula1.data.RaceManagement;
import org.formula1.data.employees.CrewMember;
import org.formula1.data.employees.Driver;
import org.formula1.data.employees.Employee;

import java.util.List;
import java.util.Random;

public class RaceManagementService {

    public int calculateTotalYearlyCostForCarParts(RaceManagement raceManagement) {
        return raceManagement.getCarPartsPricePerRacePerCar() * raceManagement.getNumberOfRacesInAYear() * raceManagement.getTeam().getCarList().size();
    }

    public int calculateTotalCostForAllPitCrewMembers(RaceManagement raceManagement) {
        List<Employee> pitCrewMembers = raceManagement.getTeam().getEmployeeList().stream().filter(employee -> employee instanceof CrewMember).toList();
        return pitCrewMembers.size() * raceManagement.getDailyPayment() * 365; // number of exact working days not provided, calculation made for full year.
    }

    public int calculateTotalCostForAllDrivers(RaceManagement raceManagement) {
        List<Employee> drivers = raceManagement.getTeam().getEmployeeList().stream().filter(employee -> employee instanceof Driver).toList();
        Random random = new Random();
        int totalCost = 0;

        for (int i = 0; i < raceManagement.getNumberOfRacesInAYear(); i++) {

            Driver racingDriver1 = (Driver) drivers.get(random.nextInt(drivers.size()));
            Driver racingDriver2 = (Driver) drivers.get(random.nextInt(drivers.size()));
            totalCost += racingDriver1.getDriverExperienceLevel().getPayPerRace() + racingDriver2.getDriverExperienceLevel().getPayPerRace();
        }
        return totalCost;
    }

    public int calculateTotalWinningsOfTheYear(RaceManagement raceManagement) {
        return raceManagement.getNumberOfWins() * raceManagement.getWinProfit() +
                raceManagement.getNumberOf2ndPlacement() * raceManagement.getProfitFor2ndPlacement();
    }

    public int calculateTotalNetProfitOfTheYear(RaceManagement raceManagement) {
        return calculateTotalWinningsOfTheYear(raceManagement) - (calculateTotalYearlyCostForCarParts(raceManagement) +
                calculateTotalCostForAllPitCrewMembers(raceManagement) + calculateTotalCostForAllDrivers(raceManagement));
    }

}
