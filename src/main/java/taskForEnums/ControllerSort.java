package taskForEnums;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ControllerSort {
    public static List<Fest> sortObjects(int parameter, List<Fest> fests) {
        List<Fest> festList = new ArrayList<>();
        if (parameter == 1) {
            Collections.sort(fests, new Comparator<Fest>() {
                @Override
                public int compare(Fest o1, Fest o2) {
                    return o1.getCity().compareTo(o2.getCity());
                }
            });
        } else if (parameter == 2) {
            Collections.sort(fests, new Comparator<Fest>() {
                @Override
                public int compare(Fest o1, Fest o2) {
                    return o1.getMonth().compareTo(o2.getMonth());
                }
            });
        } else
            Collections.sort(fests);
        return fests;
    }
}

