package Sorting.Comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestComparatorStd {
    public static void main(String[] args) {
        Student1 s1 = new Student1(1077,"Java");
        Student1 s2 = new Student1(1078,"Python");
        Student1 s3 = new Student1(1079,"C");
        Student1 s4 = new Student1(107,"JavaScript");

        List<Student1> list1 = new ArrayList<>();
        list1.add(s1);
        list1.add(s2);
        list1.add(s3);
        list1.add(s4);

        System.out.println(list1);
        Collections.sort(list1,new Student1());
        System.out.println(list1);
    }
}
