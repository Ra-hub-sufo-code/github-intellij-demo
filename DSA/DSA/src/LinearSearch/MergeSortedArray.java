package LinearSearch;

public class MergeSortedArray {

    public static void main(String[] args) {
        int[] num1=ArrayUtility.createArray();
        int[] num2=ArrayUtility.createArray();
        int[] mergeArray=mergeArray(num1,num2);

        System.out.print("Merge Array is: ");
        for (int ele:mergeArray){
            System.out.print(ele+" ");
        }
    }
    public static int[] mergeArray(int[] arr1,int[] arr2){
        int size=arr2.length+arr1.length;
        int[] newArr=new int[size];
        int j=0,k=0;
        for (int i=0; i<newArr.length; i++){

            if (j < arr1.length && (k < arr2.length && arr1[j] < arr2[k])){

                newArr[i]=arr1[j];
                j++;
            }
            else if (k < arr2.length){
                newArr[i]=arr2[k];
                k++;
            }
            else {
                newArr[i]=arr1[j];
                j++;
            }
        }
        return newArr;
    }
}
