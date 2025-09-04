package LinearSearch;

public class FindLargetSumOfSubarray {

    public static void main(String[] args) {
        int[] num={1,-3,-5,9,-6,7,-3};
        System.out.println("Largest Sum of continuous Sub Array is :"+findLargetSum(num));
    }

    public static int findLargetSum(int[] arr){
        int max=max(0,(arr.length-1),arr),cur;
        for (int in=0; in < arr.length; in++){
            for (int i=0; i < arr.length; i++){
                for (int j=in; j < i; j++){
                    cur=max(j,i,arr);
                    if (max < cur){
                        max=cur;
                    }
                }
            }
        }
        return max;
    }

    public static int max(int start,int end,int[] arr){
        int max=0;
        while (start <= end){
            max += arr[start];
            start++;
        }
        return max;
    }
}
