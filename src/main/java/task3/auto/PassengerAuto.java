package task3.auto;

public class PassengerAuto extends Auto {
    private Boolean childSeat;

    public PassengerAuto(String model, int weight, int speed,
                         String transmissionType, String autoType, Boolean childSeat) {
        super(model, weight, speed, transmissionType, autoType);
        this.childSeat = childSeat;
    }

    public Boolean getChildSeat() {
        return childSeat;
    }

    public void setChildSeat(Boolean childSeat) {
        this.childSeat = childSeat;
    }

    @Override
    public String toString() {
        return super.toString()
                + "childSeat: " + getChildSeat();
    }

    @Override
    public boolean equals(Object obj) {
        PassengerAuto passengerAuto = (PassengerAuto) obj;
        return super.equals(obj) &&
                this.childSeat == passengerAuto.getChildSeat();
    }
}