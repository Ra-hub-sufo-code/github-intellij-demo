package LinearSearch;

public class FrequencyOfArrayElement {

    public static void main(String[] args) {
        int[] ints=ArrayUtility.createArray();
        findFrequencyEachEle(ints);
    }

    public static void findFrequencyEachEle(int[] arr){
        int fre,i,pre;
        for (i=0; i < arr.length; i++){
            fre=check(i, arr.length, arr[i],arr);
            pre=check(0,i,arr[i],arr);
            if (pre <= 0){
                System.out.println("Frequency of "+arr[i]+": "+fre);
            }
        }
    }

    public static int check(int sta,int end,int ele,int[] nums){
        int count=0;
        while (sta < end){
            if (ele == nums[sta]){
                count++;
            }
            sta++;
        }
        return count;
    }
}
