package taskForLambdas;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ControllerLambda {

    public static List<Integer> createPositive(List<Integer> listNumbers) {
        InterfaceForCreateListForInteger i1 = (listNumbers1) -> {
            List<Integer> resultList = new ArrayList<>();
            for (Integer item : listNumbers1) {
                if (item >= 0) {
                    resultList.add(item);
                }
            }
            return resultList;
        };
        return i1.createListForInteger(listNumbers);
    }

    public static List<Integer> createNegative(List<Integer> listNumbers) {
        InterfaceForCreateListForInteger i2 = (list) -> {
            List<Integer> resultList = new ArrayList<>();
            for (Integer item : list) {
                if (item < 0) {
                    resultList.add(item);
                }
            }
            return resultList;
        };
        return i2.createListForInteger(listNumbers);
    }

    public static int getAverage(List<Integer> list) {
        InterfaceForReturnAverage i1 = (list1) -> {
            int count = 0;
            int sum = 0;
            for (Integer item : list1) {
                count++;
                sum += item;
            }
            return sum / count;
        };
        return i1.returnAverageForList(list);
    }

    public static List<Integer> createListBetweenAverage(List<Integer> list1, List<Integer> list2, int average1, int average2) {
        List<Integer> listsUnion = new ArrayList<>();
        listsUnion.addAll(list1);
        listsUnion.addAll(list2);
        List<Integer> resultList = new ArrayList<>();
        if (average1 < average2) {
            InterfaceForCreateListForInteger i1 = (list) -> {
                for (Integer item : list) {
                    if ((item > average1) && (item < average2)) ;
                    resultList.add(item);
                }
                return resultList;
            };
            return i1.createListForInteger(listsUnion);

        } else if (average2 < average1) {
            InterfaceForCreateListForInteger i2 = (list) -> {
                for (Integer item : list) {
                    if (item > average2 && item < average1)
                        resultList.add(item);
                }
                return resultList;
            };
            return i2.createListForInteger(listsUnion);

        } else {
            resultList.add(average1);
            return resultList;
        }
    }

    public static List<Car> createListForCarsWithParameter(String sortType, int parameter, List<Car>... lists) {
        List<Car> unionList = new ArrayList<>();
        for (List<Car> list : lists) {
            unionList.addAll(list);
        }
        if (sortType.equalsIgnoreCase("MIN")) {
            InterfaceForCreateListFromObjectsList i1 = (list, par) -> {
                List<Car> resultList = new ArrayList<>();
                for (Car l : list) {
                    if (l.getMaxSpeed() < parameter) {
                        resultList.add(l);
                    }
                }
                return resultList;
            };
            return i1.createListFromObjectsList(unionList, parameter);
        } else if (sortType.equalsIgnoreCase("MAX")) {
            InterfaceForCreateListFromObjectsList i2 = (list, par) -> {
                List<Car> resultList = new ArrayList<>();
                for (Car l : list) {
                    if (l.getMaxSpeed() > parameter) {
                        resultList.add(l);
                    }
                }
                return resultList;
            };
            return i2.createListFromObjectsList(unionList, parameter);
        }
        return new ArrayList<Car>(Arrays.asList(new Car("null", 0)));
    }

}
