package BinarySearch;

public class bitonicArray {
    public static void main(String[] args) {
        int[] num=ArrayUtility.createArray();
        System.out.println("Peak element index is :"+findPeakElement(num));
    }

    public static int findPeakEle(int[] arr){
        int ans=arr[0],start=0,end=arr.length-1 ,mid;
        while (start <= end){
            mid=(start+end)/2;
            if (ans < arr[mid]){
                ans=arr[mid];
                start=mid+1;
            }
            else {
                end=mid-1;
            }
        }
        return ans;
    }

    public static int findPeakElement(int[] arr){
        int start=0,end=arr.length-1 ,mid;
        while (start <= end){
            mid=(start+end)/2;
            if (arr[mid-1] > arr[mid]){
                end=mid;
            }
            else if (arr[mid+1] > arr[mid]){
                start=mid;
            }
            else {
                return mid;
            }
        }
        return -1;
    }
}
