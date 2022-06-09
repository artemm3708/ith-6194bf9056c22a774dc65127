package ua.ithillel.homework.hw2.task3;

public class Car {

    private boolean electricity;
    private boolean command;
    private boolean fuelSystem;

    public void start() {
        startElectricity();
        startCommand();
        startFuelSystem();
    }

    private void startElectricity() {
        this.electricity = true;
    }

    private void startCommand() {
        this.command = true;
    }

    private void startFuelSystem() {
        this.fuelSystem = true;
    }
}
