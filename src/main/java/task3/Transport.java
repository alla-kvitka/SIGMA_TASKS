package task3;

public abstract class Transport {
    private String model;
    private int weight;
    private int speed;

    public Transport(String model, int weight, int speed) {
        this.model = model;
        this.weight = weight;
        this.speed = speed;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    @Override
    public String toString() {
        return " model: " + getModel() +
                " weight: " + getWeight() +
                " speed: " + getSpeed();
    }

    @Override
    public boolean equals(Object obj) {
        Transport transport = (Transport) obj;
        return this.getModel().equals(transport.getModel()) &&
                this.getWeight() == transport.getWeight() &&
                this.getSpeed() == transport.getSpeed();
    }
}
