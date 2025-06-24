package FunctionalInterface;

@FunctionalInterface
public interface IsEvenOdd {
    public void even(int i);
}
class Odd {
    public static void main(String[] args) {
        IsEvenOdd ope = (i)-> {
            if(i%2 == 0) {
                System.out.println("Number is Even");
            }
            else {
                System.out.println("Number is Odd");
            }
        };
        ope.even(52);
    }
}