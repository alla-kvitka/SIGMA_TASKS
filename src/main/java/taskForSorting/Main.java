package taskForSorting;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

//=======Task for sorting
        Person persons[] = {
                new Person("Artem", "Kyiv", 2003, true),
                new Person("Max", "Odessa", 2002, true),
                new Person("Artem", "Odessa", 2003, true),
                new Person("Anna", "Rivne", 2002, false),
                new Person("Ivanna", "Kyiv", 1999, false),
                new Person("Bob", "Odessa", 2002, true)};

        Arrays.asList(persons);
        System.out.println(SortForPersons.sortByParameter(Arrays.asList(persons), 1));
        System.out.println(SortForPersons.sortByParameter(Arrays.asList(persons), 2));
        System.out.println(SortForPersons.sortByParameter(Arrays.asList(persons), 3));
        System.out.println(SortForPersons.sortByParameter(Arrays.asList(persons), 0));
    }
}
