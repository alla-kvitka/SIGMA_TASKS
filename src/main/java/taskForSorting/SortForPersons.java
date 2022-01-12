package taskForSorting;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortForPersons {
    public static List<Person> sortByParameter(List<Person> personList, int parameter) {
        if (parameter == 1) {
            //- при введенні “1” – по region, при однакових region: name => isMale => birthYear,
            Collections.sort(personList, new Comparator<Person>() {
                @Override
                public int compare(Person o1, Person o2) {
                    if (o1.getRegion().compareTo(o2.getRegion()) != 0) {
                        return o1.getRegion().compareTo(o2.getRegion());
                    } else if (o1.getName().compareTo(o2.getName()) != 0)
                        return o1.getName().compareTo(o2.getName());
                    else if (o1.getIsMale() != o2.getIsMale()) {
                        return o1.getIsMale() != o2.getIsMale() ? 0 : -1;
                    } else
                        return o1.getBirthYear() - o2.getBirthYear();
                }
            });
        }
        if (parameter == 2) {
            //- при введенні “2” – по birthYear, при однакових birthYear: isMale => name => region,
            Collections.sort(personList, new Comparator<Person>() {
                @Override
                public int compare(Person o1, Person o2) {
                    if (o1.getBirthYear() != o2.getBirthYear())
                        return o1.getBirthYear() - o2.getBirthYear();
                    else if (o1.getIsMale() != o2.getIsMale()) {
                        return o1.getIsMale() != o2.getIsMale() ? 0 : -1;
                    } else if (o1.getName().compareTo(o2.getName()) != 0)
                        return o1.getName().compareTo(o2.getName());
                    return o1.getRegion().compareTo(o2.getRegion());
                }
            });
        } else if (parameter == 3) {
            //- при введенні “3” – по isMale, при однакових isMale: name => region => birthYear,
            Collections.sort(personList, new Comparator<Person>() {
                @Override
                public int compare(Person o1, Person o2) {
                    if (o1.getIsMale() != o2.getIsMale()) {
                        return o1.getIsMale() != o2.getIsMale() ? 0 : -1;
                    } else if (o1.getName().compareTo(o2.getName()) != 0)
                        return o1.getName().compareTo(o2.getName());
                    else if (o1.getRegion().compareTo(o2.getRegion()) != 0) {
                        return o1.getRegion().compareTo(o2.getRegion());
                    } else return o1.getBirthYear() - o2.getBirthYear();
                }
            });
        } else
            Collections.sort(personList);
        return personList;
    }
}
        

