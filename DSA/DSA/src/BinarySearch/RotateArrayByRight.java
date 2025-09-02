package BinarySearch;

public class RotateArrayByRight {
    public static void main(String[] args) {
        int[] nums=ArrayUtility.createArray();
        rotateByRight(nums,2);
        System.out.print("Rotate Array : ");
        for (int ele:nums){
            System.out.println(ele);
        }
    }

    public static void rotateByRight(int[] arr,int k){
        int swap;
        for (int i=k; i > 0; i--){
            swap=arr[arr.length-1];
            for (int j= arr.length-1; j >0; j--){
                arr[j]=arr[j-1];
            }
            arr[0]=swap;
        }
    }
}
