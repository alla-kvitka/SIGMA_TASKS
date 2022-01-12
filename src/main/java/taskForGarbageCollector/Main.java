package taskForGarbageCollector;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        Car car1 = new Car("BMW");
        Car car2=new Car("Volvo");
        Car car3=new Car("Dodge");
        System.out.println(car1);
        System.out.println(car2);
        System.out.println(car3);
        System.out.println("===========");
        car1=null;
        car2=null;
        car3=null;
        System.out.println(car1);
        System.out.println(car2);
        System.out.println(car3);
        System.out.println("===========");
        System.gc();
        System.out.println(car1);
        System.out.println(car2);
        System.out.println(car3);
        System.out.println("===========");
    }
}
