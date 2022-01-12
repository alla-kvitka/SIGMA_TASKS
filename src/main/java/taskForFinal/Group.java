package taskForFinal;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Group {
    private List<Student> students;

    public void finalStudy(Group group) {
        students = Collections.unmodifiableList(group.students);
        for (Student st : students) {
           Student.finalStudent(st);
        }
    }

    public void addStudent(Student st3) {
        students.add(st3);
    }
}
