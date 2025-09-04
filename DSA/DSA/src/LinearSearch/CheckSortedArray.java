package LinearSearch;

public class CheckSortedArray {
    public static void main(String[] args) {
        int[] num=ArrayUtility.createArray();
        boolean is=isSortedArray(num);
        System.out.println("Array is Sorted "+is);
    }

    public static boolean isSortedArray(int[] arr){
        int i=0;
        while (i < arr.length-1){
            if (arr[i] > arr[i+1]);
            else {
                break;
            }
            i++;
        }
        if (i == arr.length-1){
            return true;
        }

        i=0;
        while (i < arr.length-1){
            if (arr[i] < arr[i+1]);
            else {
                break;
            }
            i++;
        }
        return i == arr.length - 1;
    }
}
