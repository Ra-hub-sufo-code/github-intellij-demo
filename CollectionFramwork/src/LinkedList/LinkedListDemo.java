package LinkedList;

import java.util.LinkedList;
import java.util.Scanner;

public class LinkedListDemo {
    public static void main(String[] args) {
        LinkedList<Integer> lin = new LinkedList<>();
        Scanner input = new Scanner(System.in);
        for (int i=1100; i <1105; i++) {
            System.out.print("Enter the " + i + " Element in LinkedList : ");
            int ele = input.nextInt();
            lin.add(i);
        }
        System.out.println(lin);

        if (lin.isEmpty()) {
            System.out.println("LinkedList is empty");
        }
        else {
            System.out.println("LinkedList is not empty");
        }


        lin.clear();
        if (lin.isEmpty()) {
            System.out.println("LinkedList is empty");
        }
        else {
            System.out.println("LinkedList is not empty");
        }
        System.out.println("LinkedList is: "+lin);
    }
}
