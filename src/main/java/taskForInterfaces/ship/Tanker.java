package taskForInterfaces.ship;

import taskForInterfaces.interfaces.Militant;

public class Tanker extends Ship implements Militant {
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

    @Override
    public void shoot() {
        System.out.println("Fighter Tanker shoot");
    }

    @Override
    public void disguise() {
        System.out.println("Fighter Tanker disguise");
    }
}
