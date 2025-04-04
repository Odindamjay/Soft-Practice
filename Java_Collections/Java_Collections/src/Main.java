import collections.Student;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;


class DescStudentComparator implements Comparator<Student> {
    @Override
    public int compare(Student student1, Student student2) {
        return Integer.compare(student2.getId(), student1.getId());
    }
}

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, World!");

        List<Student> students = List.of(new Student(1, "Jideofor"),
                new Student(100, "Baba T"),
                new Student(2, "Dolly p"));
        ArrayList<Student> studentsAl = new ArrayList<>(students);
        System.out.println(studentsAl);
        Collections.sort(studentsAl);
        System.out.println("Ascending : " + studentsAl);
        Collections.sort(studentsAl, new DescStudentComparator());
        System.out.println("Descending : " + studentsAl);
    }
}