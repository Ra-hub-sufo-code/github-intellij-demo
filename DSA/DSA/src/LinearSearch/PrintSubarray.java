package LinearSearch;

public class PrintSubarray {
    public static void main(String[] args) {
        int[] num=ArrayUtility.createArray();
        printSubArray(num);
    }

    public static void printSubArray(int[] arr){
        for (int in=0; in < arr.length; in++){
            for (int i=0; i < arr.length; i++){
                for (int j=in; j <= i; j++)
                {
                    System.out.print(arr[j]+" ");
                }
            }
           System.out.println(" ");
        }
    }
}
