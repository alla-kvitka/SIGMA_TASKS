package taskForInterfaces.ship;

import taskForInterfaces.interfaces.Transitable;

public class Tugboat extends Ship  implements Transitable {
    private double maxShipWeightToMove;

    public Tugboat(String model, int speed,
                   int weight, int maxDeep, double maxShipWeightToMove) {
        super(model, weight, speed, maxDeep);
        this.maxShipWeightToMove = maxShipWeightToMove;
    }

    public double getMaxShipWeightToMove() {
        return maxShipWeightToMove;
    }

    public void setMaxShipWeightToMove(double maxShipWeightToMove) {
        this.maxShipWeightToMove = maxShipWeightToMove;
    }

    @Override
    public String toString() {
        return super.toString() +
                "maxShipWeightToMove: " + getMaxShipWeightToMove();
    }

    @Override
    public boolean equals(Object obj) {
        Tugboat tugboat = (Tugboat) obj;
        return super.equals(obj) &&
                  this.getMaxShipWeightToMove()==tugboat.getMaxShipWeightToMove();
    }

    @Override
    public void loadCargo() {
        System.out.println("Tugboat loading");

    }

    @Override
    public void unloadCargo() {
        System.out.println("Tugboat unloading");
    }
}