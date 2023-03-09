package org.formula1.data;

public class RaceManagement {
    private int carPartsPricePerRacePerCar;
    private int numberOfRacesInAYear;
    private int numberOfWinsInAYear;
    private int numberOf2ndPlacementInAYear;
    private int winProfit;
    private int profitFor2ndPlacement;
    private Team team;
    private int dailyPayment;
    private int totalYearlyProfit;

    public RaceManagement(Team team, int numberOfRacesInAYear, int numberOfWinsInAYear, int numberOf2ndPlacementInAYear) {
        this.team = team;
        this.numberOfRacesInAYear = numberOfRacesInAYear;
        this.numberOfWinsInAYear = numberOfWinsInAYear;
        this.numberOf2ndPlacementInAYear = numberOf2ndPlacementInAYear;
        winProfit = 10_000_000;
        profitFor2ndPlacement = 1_000_000;
        dailyPayment = 1_000;
        totalYearlyProfit = 0;
        carPartsPricePerRacePerCar =20_000;
    }

    public int getCarPartsPricePerRacePerCar() {
        return carPartsPricePerRacePerCar;
    }

    public int getNumberOfRacesInAYear() {
        return numberOfRacesInAYear;
    }

    public int getNumberOfWins() {
        return numberOfWinsInAYear;
    }

    public int getNumberOf2ndPlacement() {
        return numberOf2ndPlacementInAYear;
    }

    public int getWinProfit() {
        return winProfit;
    }

    public int getProfitFor2ndPlacement() {
        return profitFor2ndPlacement;
    }

    public Team getTeam() {
        return team;
    }

    public int getDailyPayment() {
        return dailyPayment;
    }

    public int getTotalYearlyProfit() {return totalYearlyProfit;}

    public void setTotalYearlyProfit(int totalYearlyProfit) {
        this.totalYearlyProfit = totalYearlyProfit;
    }
}
