package Sorting.Comparable;

import java.lang.Comparable;

public class Student implements Comparable<Student> {
    int stdId;
    String course;

    public Student(int stdId,String course) {
        this.course = course;
        this.stdId =stdId;
    }

    @Override
    public int compareTo(Student o) {
        return this.course.compareTo(o.course);
    }

    @Override
    public String toString() {
        return "Student{" +
                "stdId=" + stdId +
                ", course='" + course + '\'' +
                '}';
    }
}
