package task3.airplane;

public class FighterAircraft extends Airplane {
    private int numberOfShells;

    public FighterAircraft(String model, int weight, int speed, int maxHeight, String airCompany, int numberOfShells) {
        super(model, weight, speed, maxHeight, airCompany);
        this.numberOfShells = numberOfShells;
    }

    int getNumberOfShells() {
        return numberOfShells;
    }

    protected void setNumberOfShells(int numberOfShells) {
        this.numberOfShells = numberOfShells;
    }

    @Override
    public String toString() {
        return super.toString() +
                "numberOfShells: " + getNumberOfShells();

    }

    @Override
    public boolean equals(Object obj) {
        FighterAircraft fighterAircraft = (FighterAircraft) obj;
        return (super.equals(obj) &&
                this.getNumberOfShells() == fighterAircraft.getNumberOfShells());
    }
}