package FunctionalInterface;

@FunctionalInterface
public interface Student {
    public int stdTotalMarks(int marks1,int marks2);
}
class TestStudent {
    public static void main(String[] args) {
        Student exam = (m1,m2)-> m1+m2;
        System.out.println("Your marks is: "+
                            exam.stdTotalMarks(45,55));
    }
}