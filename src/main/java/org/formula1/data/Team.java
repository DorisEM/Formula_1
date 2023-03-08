package org.formula1.data;


import org.formula1.data.employees.Employee;

import java.util.ArrayList;
import java.util.List;

public class Team {

    private List<Car> carList;
    private List<Employee> employeeList;

    public Team() {
        carList = new ArrayList<>();
        employeeList = new ArrayList<>();
    }

    public List<Car> getCarList() {
        return carList;
    }

    public void addCars(Car...cars) {
        for (Car car: cars) {
            carList.add(car);
        }
    }

    public List<Employee> getEmployeeList() {
        return employeeList;
    }

    public void addEmployee(Employee...employees) {
        for (Employee employee : employees) {
            employeeList.add(employee);
        }
    }

    @Override
    public String toString() {
        return "Team{" +
                "carList=" + carList +
                ", employeeList=" + employeeList +
                '}';
    }
}
