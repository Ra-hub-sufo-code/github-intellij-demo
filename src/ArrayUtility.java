import java.util.Scanner;

public class ArrayUtility {
    public static int[] inputArray(  ) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the array size:");
        int size = input.nextInt();
        int[] arr = new int[size];
        int i;
        for(i=0; i < arr.length; i++) {
            System.out.print("Enter the "+(i+1)+" Element:");
            arr[i] = input.nextInt();
        }
        return arr;
    }
}
