package taskForFiles;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Bottle {
    private Integer num;
    private String bottle;
    private Double volume;
    private String material;
}
