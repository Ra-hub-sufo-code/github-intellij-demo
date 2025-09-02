package BinarySearch;

import java.util.Scanner;

public class ArrayUtility {

    public static int[] createArray( ){
        Scanner sc=new Scanner(System.in);
        int size;
        System.out.print("Enter the size of Array: ");
        size=sc.nextInt();
        int[] arr=new int[size];
        System.out.println("Enter the Element of Array: ");
        for (int i=0; i<arr.length; i++){
            arr[i]=sc.nextInt();
        }
        return arr;
    }

}
