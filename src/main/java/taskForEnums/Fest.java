package taskForEnums;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Fest implements Comparable {
    private String name;
    private String city;
    private YEAR_MONTH month;

    @Override
    public int compareTo(Object o) {
        if (this.getName().compareTo(((Fest)o).getName())!=0)
        return this.getName().compareTo(((Fest)o).getName());
        else if (this.getCity().compareTo(((Fest)o).getCity())!=0)
            return this.getCity().compareTo(((Fest)o).getCity());
        else return this.month.compareTo(((Fest)o).getMonth());
    }
}
