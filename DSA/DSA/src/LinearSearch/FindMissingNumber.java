package LinearSearch;

public class FindMissingNumber {

    public static void main(String[] args) {
        int[] nums=ArrayUtility.createArray();
        findMissingNum(nums);
    }
    public static void findMissingNum(int[] arr){
        int ele,i;
        System.out.print("Missing Number is: ");
        for (i=1; i<=arr.length; i++){
            for (ele=0; ele < arr.length; ele++){
                if (arr[ele] == i){
                    break;
                }
            }
            if (ele == arr.length){
                System.out.println(i+" ");
            }
        }

    }
}
