package LinearSearch;

public class MoveZeroEndOfArray {

    public static void main(String[] args) {
        int[] ints=ArrayUtility.createArray();
        moveZeroEnd(ints);
        System.out.print("Moved zero Array is: ");
        ArrayUtility.printArray(ints);
    }
    public static void moveZeroEnd(int[] arr){
        int i,swap;
        for (i=0; i < arr.length; i++){
            if (arr[i] ==0){
                for (int j=i; j < arr.length-1; j++){
                    swap=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=swap;
                }

            }
            if (i > 0 &&arr[i-1] ==0){
                for (int j=i-1; j < arr.length-1; j++){
                    swap=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=swap;
                }

            }
        }
    }


}
