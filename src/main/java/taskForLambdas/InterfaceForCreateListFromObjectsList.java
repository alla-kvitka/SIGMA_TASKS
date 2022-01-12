package taskForLambdas;

import java.util.List;

@FunctionalInterface
public interface InterfaceForCreateListFromObjectsList {
    List<Car> createListFromObjectsList(List<Car> list, int parameter);
}
