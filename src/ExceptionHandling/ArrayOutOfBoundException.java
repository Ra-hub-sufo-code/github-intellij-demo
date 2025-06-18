package ExceptionHandling;
import java.util.Scanner;

public class ArrayOutOfBoundException {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] arr = {45,67,90};
        arrayOutOfBound(arr);
    }
    public static void arrayOutOfBound ( int[] arr) {
        int i = arr.length;
        try {
            int j = arr[i];
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array Out of bound");
        }
    }
}
