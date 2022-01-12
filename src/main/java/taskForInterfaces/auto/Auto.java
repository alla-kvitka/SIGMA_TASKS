package taskForInterfaces.auto;

import task3.Transport;

public abstract class Auto extends Transport {
    private String transmissionType;
    private String autoType;

    public Auto(String model, int weight, int speed, String transmissionType, String autoType) {
        super(model, weight, speed);
        this.transmissionType = transmissionType;
        this.autoType = autoType;
    }

    public String getTransmissionType() {
        return transmissionType;
    }

    public void setTransmissionType(String transmissionType) {
        this.transmissionType = transmissionType;
    }

    public String getAutoType() {
        return autoType;
    }

    public void setAutoType(String autoType) {
        this.autoType = autoType;
    }

    @Override
    public String toString() {
        return super.toString() +
                " transmissionType: " + getTransmissionType() +
                " autoType: " + getAutoType();
    }

    @Override
    public boolean equals(Object obj) {
        Auto auto = (Auto) obj;
        return super.equals(obj) &&
                this.getAutoType().equals(auto.getAutoType()) &&
                this.getTransmissionType().equals(auto.getTransmissionType());
    }
}
