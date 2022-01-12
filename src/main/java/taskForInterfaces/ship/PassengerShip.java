package taskForInterfaces.ship;

import taskForInterfaces.interfaces.Passenger;

public class PassengerShip extends Ship implements Passenger {
    private int numberOfCabins;

    public PassengerShip(String model, int speed, int weight,
                         int maxDeep, int numberOfCabins) {
        super(model, speed, weight, maxDeep);
        this.numberOfCabins = numberOfCabins;
    }

    public int getNumberOfCabins() {
        return numberOfCabins;
    }

    public void setNumberOfCabins(int numberOfCabins) {
        this.numberOfCabins = numberOfCabins;
    }

    @Override
    public String toString() {
        return super.toString()
                + "numberOfCabins: " + getNumberOfCabins();
    }

    @Override
    public boolean equals(Object obj) {
        PassengerShip passengerShip = (PassengerShip) obj;
        return (super.equals(obj) &&
                this.getNumberOfCabins()==passengerShip.getNumberOfCabins());
    }

    @Override
    public void passengerEntrance() {
        System.out.println("Passenger Entrance in PassengerShip");
    }

    @Override
    public void passengerExit() {
        System.out.println("Passenger Exit from PassengerShip");
    }
}
