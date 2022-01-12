package part13;

public class Car {
    private String model;
    private String owner;
    private int price;
    private int produceYear;

    public Car(String model, String owner, int price, int produceYear) {
        this.model = model;
        this.owner = owner;
        this.price = price;
        this.produceYear = produceYear;
    }


    @Override
    public String toString() {
        return "\n"+" model: " + getModel() +
                " owner: " + getOwner() +
                " price: " + getPrice() +
                " produceYear: " + getProduceYear() ;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getProduceYear() {
        return produceYear;
    }

    public void setProduceYear(int produceYear) {
        this.produceYear = produceYear;
    }
}
