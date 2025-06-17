public class FindDuplicate {
    public static void main(String[] args) {
        int[] arr = ArrayUtility.inputArray();
        arrDuplicate(arr);
    }
    public static void arrDuplicate( int[] array) {
        int i,j,k;
        for (i=0; i < array.length; i++) {
            for (k = i-1; k >= 0; k--) {
                if (array[k] == array[i]) {
                    break;
                }
            }
            for ( j=i+1; j < array.length; j++) {
                if ( k != -1) {
                    break;
                }
                if ( array[i] == array[j]) {
                    System.out.print("Duplicate element is:"+array[i]+"\n");
                }
            }
        }
    }
}
