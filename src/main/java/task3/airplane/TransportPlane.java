package task3.airplane;

public class TransportPlane extends Airplane {
    private static int maxWeight;
    private static int weightFilled;

    public TransportPlane(String model, int weight, int speed, int maxHeight, String airCompany) {
        super(model, weight, speed, maxHeight, airCompany);
    }

    public static int getMaxWeight() {
        return maxWeight;
    }

    public static void setMaxWeight(int maxWeight) {
        TransportPlane.maxWeight = maxWeight;
    }

    public static int getWeightFilled() {
        return weightFilled;
    }

    public static void setWeightFilled(int weightFilled) {
        TransportPlane.weightFilled = weightFilled;
    }

    @Override
    public String toString() {
        return super.toString() +
                " maxWeight: " + getMaxWeight() +
                " weightFilled: " + getWeightFilled();
    }

    @Override
    public boolean equals(Object obj) {
        TransportPlane transportPlane = (TransportPlane) obj;
        return super.equals(obj) &&
                this.getMaxWeight() == transportPlane.getMaxWeight() &&
                this.getWeightFilled()==transportPlane.getWeightFilled();
    }
}
