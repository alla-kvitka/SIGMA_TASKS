package taskForFinal;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Collections;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Student {
    private String name;
    private List<Integer> marks;

    public static void finalStudent(Student student) {
        student.marks = Collections.unmodifiableList(student.marks);
    }
}
