package ExceptionHandling;

public class CalculateAge {
    public static void main(String[] args) {
        try {
            age(-1);
        }
        catch (Exception e) {
            System.out.println(e);
        }
    }
    public static void age(int age) throws Exception {
        if (age<0) {
            throw new Exception("Age cannot negative");
        }
        else {
            System.out.println("Your age is: "+age);
        }
    }
}
