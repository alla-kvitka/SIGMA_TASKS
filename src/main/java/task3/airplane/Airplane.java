package task3.airplane;

import task3.Transport;

public class Airplane extends Transport {
    private int maxHeight;
    private String airCompany;

    public Airplane(String model, int weight, int speed, int maxHeight, String airCompany) {
        super(model, weight, speed);
        this.maxHeight = maxHeight;
        this.airCompany = airCompany;
    }

    public int getMaxHeight() {
        return maxHeight;
    }

    public void setMaxHeight(int maxHeight) {
        this.maxHeight = maxHeight;
    }

    public String getAirCompany() {
        return airCompany;
    }

    public void setAirCompany(String airCompany) {
        this.airCompany = airCompany;
    }

    @Override
    public String toString() {
        return super.toString()
                + " airCompany: " + getAirCompany()
                + " maxHeight: " + getMaxHeight();
    }

    @Override
    public boolean equals(Object obj) {
        Airplane airplane = (Airplane) obj;
        return (super.equals(obj) &&
                this.getAirCompany().equals(airplane.getAirCompany()) &&
                this.getMaxHeight() == airplane.getMaxHeight());
    }
}