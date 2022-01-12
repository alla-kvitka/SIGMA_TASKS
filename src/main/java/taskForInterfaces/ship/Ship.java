package taskForInterfaces.ship;

import task3.Transport;

public abstract class Ship extends Transport {

    private int maxDeep;

    public Ship(String model, int weight, int speed, int maxDeep) {
        super(model, weight, speed);

        this.maxDeep = maxDeep;
    }

    public int getMaxDeep() {
        return maxDeep;
    }

    public void setMaxDeep(int maxDeep) {
        this.maxDeep = maxDeep;
    }

    @Override
    public String toString() {
        return super.toString() +
                "maxDeep: " + getMaxDeep();
    }

    @Override
    public boolean equals(Object obj) {
        Ship ship = (Ship) obj;
        return (super.equals(obj) &&
                this.getMaxDeep() == ship.getMaxDeep());
    }
}
