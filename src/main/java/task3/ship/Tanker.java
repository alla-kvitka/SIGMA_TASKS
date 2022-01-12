package task3.ship;

public class Tanker extends Ship {
    private String typeOfTransportedMaterial;

    public Tanker(String model, int speed, int weight,
                  int maxDeep, String typeOfTransportedMaterial) {
        super(model, speed, weight, maxDeep);
        this.typeOfTransportedMaterial = typeOfTransportedMaterial;
    }

    public String getTypeOfTransportedMaterial() {
        return typeOfTransportedMaterial;
    }

    public void setTypeOfTransportedMaterial(String typeOfTransportedMaterial) {
        this.typeOfTransportedMaterial = typeOfTransportedMaterial;
    }

    @Override
    public String toString() {
        return super.toString()
                + "typeOfTransportedMaterial: " + getTypeOfTransportedMaterial();
    }

    @Override
    public boolean equals(Object obj) {
        Tanker tanker = (Tanker) obj;
        return super.equals(obj) &&
                this.getTypeOfTransportedMaterial().equals(tanker.getTypeOfTransportedMaterial());
    }
}
