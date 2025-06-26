package ArrayList;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

class Student {
    int stdId;
    double rollNumber;
    String course;
    double marks;

    public Student(int stdId, double rollNumber, String course, double marks) {
        this.stdId = stdId;
        this.rollNumber = rollNumber;
        this.course = course;
        this.marks = marks;
    }

    @Override
    public String toString() {
        return "Student{" +
                "stdId=" + stdId +
                ", rollNumber=" + rollNumber +
                ", course='" + course + '\'' +
                ", marks=" + marks +
                '}';
    }
}

public class CustomList{
    public static void main(String[] args) {
        Student s1 = new Student(1001,100,"Java",80);
        Student s2 = new Student(1002,101,"Java",81);
        Student s3 = new Student(1003,102,"Java",82);
        List<Student> std = new ArrayList<>();
        std.add(s1);
        std.add(s2);
        std.add(s3);

        Iterator<Student> it = std.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
        //System.out.println("\n"+std);
    }
}
