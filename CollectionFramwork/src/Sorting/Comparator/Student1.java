package Sorting.Comparator;

import java.util.Comparator;

public class Student1 implements Comparator<Student1> {
    int stdId;
    String course;

    public Student1( ) { }

    public Student1(int stdId, String course) {
        this.course = course;
        this.stdId =stdId;
    }

    @Override
    public int compare(Student1 o1, Student1 o2) {
        return o2.stdId-o1.stdId;
    }

    @Override
    public String toString() {
        return "Student{" +
                "stdId=" + stdId +
                ", course='" + course + '\'' +
                '}';
    }
}
