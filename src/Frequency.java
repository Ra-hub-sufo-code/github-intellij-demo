public class Frequency {
    public static void main(String[] args) {
        int[] arr = ArrayUtility.inputArray();
        Frequency obj = new Frequency();
        obj.resFrequency( arr);
    }
    public void resFrequency( int[] array) {
        int i,j,k,count;
        for (i=0; i < array.length; i++) {
            count = 0;
            for (k = i-1; k >= 0; k--) {
                if (array[k] == array[i]) {
                    break;
                }
            }
            for ( j=0; j < array.length; j++) {
                if ( k != -1) {
                    break;
                }
                if ( array[i] == array[j]) {
                    count++;
                }
            }
            if ( count > 0) {
                System.out.println("Frequency of this element is: "+
                        array[i]+":"+count);
            }
        }
    }
}
