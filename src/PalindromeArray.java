public class PalindromeArray {
    public static void main(String[] args) {
        int[] arr = ArrayUtility.inputArray();
        boolean res = ArrayPali(arr);
        if( res ) {
            System.out.println("Given array is palindrome");
        } else {
            System.out.println("Given array is not palindrome");
        }
    }
    public static boolean ArrayPali( int[] array) {
        int i,j=(array.length-1);
        for(i=0; i< array.length; i++) {
            if( i == (int) (array.length/2) ) {
                return true;
            } else if ( array[i] != array[j]){
                return false;
            }
            j--;
        }
        return false;
    }
}