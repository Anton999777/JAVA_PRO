package HomeWork6;

public class Car {
    public void start () {
        startElectricity();
        startCommand();
        startFuelSystem();
        System.out.println("Engine started");
    }
    private void startElectricity () {
        System.out.println("Electricity included");
    }
    private void startCommand () {
        System.out.println("Run command activated");
    }
    private void startFuelSystem () {
        System.out.println("Fuel system started");
    }
}
