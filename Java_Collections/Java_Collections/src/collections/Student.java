package collections;

import java.util.Comparator;
import java.util.List;


public class Student implements Comparable<Student> {

    private int id;
    private String name;

    public Student(int id, String name) {
        super();
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String toString() {
        return id + " " + name;
    }
    @Override
    public int compareTo(Student that) {
        return Integer.compare(this.id, that.id);
    }

//    @SuppressWarnings({"unchecked", "rawtypes"})
//    public static <T> sort(List<T> list, Comparator<? super T> c) {
//    }
//		list.sort(c);


}
