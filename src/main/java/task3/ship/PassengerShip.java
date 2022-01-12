package task3.ship;

public class PassengerShip extends Ship {
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
}
