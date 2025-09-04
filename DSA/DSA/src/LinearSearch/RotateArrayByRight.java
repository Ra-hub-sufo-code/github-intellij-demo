package LinearSearch;

import java.util.Scanner;

public class RotateArrayByRight {

    public static void main(String[] args) {
        int[] marks=new int[4];
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the Marks: ");
        for(int i=0; i < marks.length; i++){
            marks[i]=sc.nextInt();
        }

        rotateByRight(marks);
        System.out.print("Roted Array by Right one Position is: ");
        for (int ele:marks){
            System.out.print(ele+" ");
        }

        System.out.println();
        int[] ints=ArrayUtility.createArray();
        rotateByRight(ints,2);
        System.out.print("Rotated Array By Right k Position is: ");
        for (int ele:ints){
            System.out.print(ele+" ");
        }
    }
    public static void rotateByRight(int[] arr){
        int rotate=(arr.length-1),swap;
        while(rotate > 0){
            swap=arr[rotate];
            arr[rotate] = arr[rotate-1];
            arr[rotate-1]=swap;
            rotate--;
        }
    }

    public static void rotateByRight(int[] arr,int k){
        int swap;
        for (int i=k; i > 0; i--){
            for (int rotate=(arr.length-1); rotate > 0; rotate--){
                swap=arr[rotate];
                arr[rotate] = arr[rotate-1];
                arr[rotate-1]=swap;
            }
        }

    }
}
