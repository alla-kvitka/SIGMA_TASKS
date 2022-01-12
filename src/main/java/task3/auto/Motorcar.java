package task3.auto;

public class Motorcar extends Auto {
    private int maxCargoVolume;

    public Motorcar(String model, int weight, int speed,
                    String transmissionType, String autoType, int maxCargoVolume) {
        super(model, weight, speed, transmissionType, autoType);
        this.maxCargoVolume = maxCargoVolume;
    }

    public int getMaxCargoVolume() {
        return maxCargoVolume;
    }

    public void setMaxCargoVolume(int maxCargoVolume) {
        this.maxCargoVolume = maxCargoVolume;
    }

    @Override
    public String toString() {
        return super.toString()
                + "maxCargoVolume: " + getMaxCargoVolume();
    }

    @Override
    public boolean equals(Object obj) {
        Motorcar motorcar = (Motorcar) obj;
        return super.equals(obj) &&
                this.getMaxCargoVolume() == motorcar.getMaxCargoVolume();
    }
}
