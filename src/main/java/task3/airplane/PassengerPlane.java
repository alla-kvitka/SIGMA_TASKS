package task3.airplane;

public class PassengerPlane extends Airplane {
    private static int countOfPassengers;
    private double ticketPrise;
    private String pointA;
    private String pointB;

    public PassengerPlane(String model, int weight, int speed, int maxHeight,
                          String airCompany, double ticketPrise, String pointA, String pointB) {
        super(model, weight, speed, maxHeight, airCompany);
        this.ticketPrise = ticketPrise;
        this.pointA = pointA;
        this.pointB = pointB;
    }

    public static int getCountOfPassengers() {
        return countOfPassengers;
    }

    public static void setCountOfPassengers(int countOfPassengers) {
        PassengerPlane.countOfPassengers = countOfPassengers;
    }

    public double getTicketPrise() {
        return ticketPrise;
    }

    public void setTicketPrise(double ticketPrise) {
        this.ticketPrise = ticketPrise;
    }

    public String getPointA() {
        return pointA;
    }

    public void setPointA(String pointA) {
        this.pointA = pointA;
    }

    public String getPointB() {
        return pointB;
    }

    public void setPointB(String pointB) {
        this.pointB = pointB;
    }

    @Override
    public String toString() {
        return super.toString() +
                " countOfPassengers: " + getCountOfPassengers() +
                " ticketPrise: " + getTicketPrise() +
                " pointA: " + getPointA() +
                " pointB: " + getPointB();
    }

    @Override
    public boolean equals(Object obj) {
        PassengerPlane passengerPlane = (PassengerPlane) obj;
        return super.equals(obj) &&
                this.getCountOfPassengers() == passengerPlane.getCountOfPassengers() &&
                this.getTicketPrise() == passengerPlane.getTicketPrise() &&
                this.pointA.equals(passengerPlane.getPointA()) &&
                this.pointB.equals(passengerPlane.getPointB());
    }
}
