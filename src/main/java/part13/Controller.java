package part13;

import java.util.ArrayList;
import java.util.List;

public class Controller {
    public List<Car> returnListCarWithOwnerName(String name, List<Car> carList) {
        List<Car> listCarWithOwnerName = new ArrayList<>();
        for (Car car : carList) {
            if (car.getOwner().equals(name))
                listCarWithOwnerName.add(car);
        }
        return listCarWithOwnerName;
    }

    public Boolean checkIfExist(String name, List<Car> carList) {
        for (Car owner : carList) {
            if (owner.toString().contains(name)) {
                return true;
            }
        }
        return false;
    }
}
