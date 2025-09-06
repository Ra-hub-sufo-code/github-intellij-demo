package LinearSearch;

public class FindEleAppearOnlyOnce {

    public static void main(String[] args) {
        int[] nums=ArrayUtility.createArray();
        findEleAppearOnce(nums);
    }
    public static void findEleAppearOnce(int[] arr){
        int appear,cur;
        System.out.println("Elements that appear only once: ");
        for (int i=0; i < arr.length; i++){
            appear=checkAppears(i,arr.length,arr[i],arr);
            if (appear <= 1){
                cur=checkAppears(0,i,arr[i],arr);
                if (i ==0 || cur < 1){
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
