package LinearSearch;

public class RotateArrayByLeft {

    public static void main(String[] args) {
        int[] num=ArrayUtility.createArray();

        RotateArrayByLeft obj=new RotateArrayByLeft();
        obj.rotateArray(num);

        System.out.print("Roted Array is: ");
        for (int ele:num){
            System.out.print(ele+" ");
        }
        System.out.println();

        int[] array=ArrayUtility.createArray();
        rotateArrayByK(array,2);
        System.out.print("Roted by k Array is: ");
        for (int ele:array){
            System.out.print(ele+" ");
        }
    }

    public void rotateArray(int[] arr){
        int swap;
        for (int i=0; i< (arr.length-1); i++){
            swap=arr[i];
            arr[i]=arr[i+1];
            arr[i+1]=swap;
        }
    }

    public static void rotateArrayByK(int[] arr,int k){
        int swap;
        for (int rotate=0; rotate < k; rotate++){
            for (int i=0; i< (arr.length-1); i++){
                swap=arr[i];
                arr[i]=arr[i+1];
                arr[i+1]=swap;
            }
        }

    }
}
