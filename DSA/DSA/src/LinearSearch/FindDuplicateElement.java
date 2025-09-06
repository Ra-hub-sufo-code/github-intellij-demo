package LinearSearch;

public class FindDuplicateElement {
    public static void main(String[] args) {
        int[] nums=ArrayUtility.createArray();
        findEleAppearOnce(nums);
    }
    public static void findEleAppearOnce(int[] arr){
        int dup,cur;
        System.out.print("Duplicate Element is: ");
        for (int i=0; i < arr.length; i++){
            dup=checkAppears(i,arr.length,arr[i],arr);
            if (dup >= 2){
                cur=checkAppears(0,i,arr[i],arr);
                if (cur <= 0){
                    System.out.print(arr[i]+" ");
                }
            }
        }
    }

    public static int checkAppears(int sta,int end,int ele,int[] ints){
        int count=0;
        while (sta < end){
            if (ele == ints[sta]){
                count++;
            }
            sta++;
        }
        return count;
    }
}
