public class RotateByN {
    public static void main(String[] args) {
        int[] arr = ArrayUtility.inputArray();
        rotateByN(arr);
        for (int i=0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
    public static void rotateByN( int[] arr) {
        int i,j,swp;
        for ( i=0; i < (arr.length-1); i++) {
            swp=arr[i];
            arr[i]=arr[i+1];
            arr[i+1] = swp;
        }
    }
}
