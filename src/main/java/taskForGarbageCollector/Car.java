package taskForGarbageCollector;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.IOException;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Car {
    private String model;

    @Override
    protected void finalize() throws IOException {
        System.out.println("Finalize....");
    }
}
