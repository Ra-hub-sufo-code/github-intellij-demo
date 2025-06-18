package ExceptionHandling;

import java.util.Scanner;

public class ArithmeticExce {
    public static void main(String[] args) {
        System.out.println("Welcome to solve arithmetic exception");
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int num1 = input.nextInt();
        System.out.print("Enter the Second number: ");
        int num2 = input.nextInt();
        int res = division(num1,num2);
        if (res != 0) {
            System.out.print("Division of two number is: "+res);
        }
    }
    public static int division(int num1,int num2) {
        int res =0;
        try {
            int i = num1 / num2;
            res = num1/num2;
        }
        catch (ArithmeticException e) {
            System.out.println("First number divide by zero");
        }
        return res;
    }
}
