package part13;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Car> carList = new ArrayList<>();
        carList.add(new Car("Toyota", "Serg", 2500, 2003));
        carList.add(new Car("Shkoda", "Daniel", 1500, 1999));
        carList.add(new Car("BMW", "Dima", 20000, 2015));
        carList.add(new Car("Tesla", "Serg", 200000, 2007));
        carList.add(new Car("Lexus", "Serg", 34500, 2009));
        Controller controller = new Controller();
        System.out.println(controller.returnListCarWithOwnerName("Dima", carList));
        System.out.println(controller.checkIfExist("Oleg",carList));

    }
}
