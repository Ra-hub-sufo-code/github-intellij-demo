package LinearSearch;

import java.util.HashSet;
import java.util.Set;

public class FindIntersectionOfTwoArray {

    public static void main(String[] args) {
        int[] ints1=ArrayUtility.createArray();
        int[] ints2=ArrayUtility.createArray();
        findIntersection(ints1,ints2);
    }
    public static void findIntersection(int[] arr1,int[] arr2){
        Set<Integer> integers=new HashSet<>();
        for (int ele1:arr1){
            for (int ele2:arr2){
                if (ele1 == ele2){
                    integers.add(ele1);
                }
            }
        }
        System.out.println("Intersection of Array is "+integers);
    }

}
