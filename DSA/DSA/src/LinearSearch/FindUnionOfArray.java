package LinearSearch;

import java.util.HashSet;
import java.util.Set;

public class FindUnionOfArray {

    public static void main(String[] args) {
        int[] ints1=ArrayUtility.createArray();
        int[] ints2=ArrayUtility.createArray();
        findUnion(ints1,ints2);
    }
    public static void findUnion(int[] arr1,int[] arr2){
        Set<Integer> nums=new HashSet<>();
        for (int ele1:arr1){
            for (int ele2:arr2){
                if (ele1 != ele2){
                    nums.add(ele1);
                    nums.add(ele2);
                }
            }
        }
        System.out.println("Union of Array is: "+nums);
    }
}
