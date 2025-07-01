package Sorting.Comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestStudent {
    public static void main(String[] args) {
        Student s1 = new Student(1001,"Java");
        Student s2 = new Student(1002,"Python");
        Student s3 = new Student(1003,"HTML");
        Student s4 = new Student(1004,"C++");

        List<Student> list = new ArrayList<>();
        list.add(s1);
        list.add(s2);
        list.add(s3);
        list.add(s4);

        System.out.println(list);
        Collections.sort(list);
        System.out.println(list);
    }
}
