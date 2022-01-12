package task3.auto;

public class Bus extends Auto {
    private static int maxCountOfPassenger;
    private int ticketPrice;

    public Bus(String model, int weight, int speed,
               String transmissionType, String autoType, int ticketPrice) {
        super(model, weight, speed, transmissionType, autoType);
        this.ticketPrice = ticketPrice;
    }

    public static int getMaxCountOfPassenger() {
        return maxCountOfPassenger;
    }

    public static void setMaxCountOfPassenger(int maxCountOfPassenger) {
        Bus.maxCountOfPassenger = maxCountOfPassenger;
    }

    public int getTicketPrice() {
        return ticketPrice;
    }

    public void setTicketPrice(int ticketPrice) {
        this.ticketPrice = ticketPrice;
    }

    @Override
    public String toString() {
        return super.toString()
                + "ticketPrice: " + getTicketPrice()
                + "maxCountOfPassenger: " + getMaxCountOfPassenger();
    }

    @Override
    public boolean equals(Object obj) {
        Bus bus = (Bus) obj;
        return super.equals(obj) &&
                this.getMaxCountOfPassenger() == bus.getMaxCountOfPassenger() &&
                this.getTicketPrice() == bus.getTicketPrice();
    }

}
