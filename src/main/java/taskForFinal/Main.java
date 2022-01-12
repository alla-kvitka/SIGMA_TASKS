package taskForFinal;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> marks1= new ArrayList(Arrays.asList(4, 5, 3, 3));
        List<Integer> marks2= new ArrayList(Arrays.asList(5, 4, 1, 3));
        List<Integer> marks3= new ArrayList(Arrays.asList(5, 2, 4, 4));
        Student st1 = new Student("Anna", marks1);
        Student st2 = new Student("Ivanna", marks2);
        Student st3 = new Student("Oleg", marks3);

        List<Student> students= new ArrayList(Arrays.asList(st1, st2));

        Group group = new Group(students);
        System.out.println(group);

//        group.addStudent(st3);
        group.finalStudy(group);
        try{
            group.addStudent(st3);
        }
        catch (Exception e){
            System.out.println(e);
        }
        System.out.println(group);
    }
}
