package taskForSorting;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Person implements Comparable<Person> {
    private String name;
    private String region;
    private int birthYear;
    private Boolean isMale;

    @Override
    public int compareTo(Person o) {
        if (this.getName().compareTo(o.getName()) != 0)
            return this.getName().compareTo(o.getName());
        else if (this.getRegion().compareTo(o.getRegion()) != 0)
            return this.getRegion().compareTo(o.getRegion());
        else if (this.getBirthYear() - o.getBirthYear() != 0)
            return this.getBirthYear() - o.getBirthYear();
        else return this.getIsMale() == o.getIsMale() ? 0 : -1;
    }

    @Override
    public String toString() {
        return "name " + name +
                " region " + region +
                " birthYear " + birthYear +
                " isMale " + isMale;
    }
}
