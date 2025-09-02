package BinarySearch;

public class FindEleInfiniteArray {
    public static void main(String[] args) {
        int[] num=ArrayUtility.createArray();
        System.out.println("Result of target Element is: "+ans(num,2000));
    }
    //return index of target element
    public static int ans(int[] arr,int tar){
        int start=0,end=1;
        while (tar > arr[end]){
            int temp=end+1;
            if (arr.length > end){
                end=end+(end-start+1)*2;
                if (end > (arr.length-1)){
                    end=arr.length-1;
                    break;
                }
            } else {
                end=arr.length-1;
                break;
            }
            start=temp;
        }
       return index(arr,start,end,tar);
    }

    public static int index(int[] nums,int sta,int end,int tar){
        int mid;
        while (sta <= end){
            mid=(sta+end)/2;
            if (nums[mid] == tar){
                return mid;
            } else if (nums[mid] < tar ) {
                sta =mid+1;
            }
            else {
                end=mid-1;
            }
        }
        return -1;
    }
}
