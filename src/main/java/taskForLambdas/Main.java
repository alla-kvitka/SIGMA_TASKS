package taskForLambdas;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        //лямбди
        List<Integer> listForTest = new ArrayList<>();
        listForTest.add(8);
        listForTest.add(-3);
        listForTest.add(-8);
        listForTest.add(11);
        listForTest.add(4);
        listForTest.add(4);
        listForTest.add(-2);
        listForTest.add(-4);

        List<Integer> listPositive = ControllerLambda.createPositive(listForTest);
        List<Integer> listNegative = ControllerLambda.createNegative(listForTest);
        int averageForPositive = ControllerLambda.getAverage(listPositive);
        int averageForNegative = ControllerLambda.getAverage(listNegative);
        System.out.println(averageForPositive);
        System.out.println(averageForNegative);
        System.out.println(ControllerLambda.createListBetweenAverage(listPositive, listNegative,
                averageForPositive, averageForNegative));

        List<Car> cars1 = new ArrayList<>(Arrays.asList(
                new Car("UAZ", 120),
                new Car("Bugatti", 420),
                new Car("GAZ", 145),
                new Car("Suzuki", 230),
                new Car("Honda", 280)));
        List<Car> cars2 = new ArrayList<>(Arrays.asList(
                new Car("Opel", 240),
                new Car("BMW", 270),
                new Car("Renault", 180),
                new Car("Mercedes-Benz", 310)));
        List<Car> cars3 = new ArrayList<>(Arrays.asList(
                new Car("Cadillac", 250),
                new Car("Lada", 170),
                new Car("Peugeot", 190),
                new Car("Nisan", 210),
                new Car("Mitsubishi", 260)));

        System.out.println(ControllerLambda.createListForCarsWithParameter("min", 180, cars1, cars2, cars2));
    }
    }
