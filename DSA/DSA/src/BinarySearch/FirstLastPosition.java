package BinarySearch;

public class FirstLastPosition {
    public static void main(String[] args) {
        int[] num=ArrayUtility.createArray();
        int[] ans=firLastPos(num,5);
        System.out.println("First and Last Position is : "+ans[0]+" and "+ans[1]);
    }

    public static int[] firLastPos(int[] arr,int target){
        int[] res={-1,-1};
        int mid,sta=0,end=arr.length-1;
        while (sta <= end){
            mid=(sta+end)/2;

            if (arr[mid]==target){
                res[0]=mid;
                end=mid-1;
            }

            else if (arr[mid] <target){
                sta=mid+1;
            }
            else {
                end=mid-1;
            }
        }

        sta=0;
        end=arr.length-1;
        while (sta <= end){
            mid=(sta+end)/2;

            if (arr[mid]==target){
                res[1]=mid;
                sta=mid+1;
            }

            else if (arr[mid] <target){
                sta=mid+1;
            }
            else {
                end=mid-1;
            }
        }

        return res;
    }
}
