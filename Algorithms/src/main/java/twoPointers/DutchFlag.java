package twoPointers;

/**
 * Given an array og 0, 1, 2 sort it treating 0 1 2 as numbers. Sort in-place
 */
public class DutchFlag {
    public static void sort(int[] arr) {
       int low = 0;
       int high = arr.length - 1;

       for( int i = 0;  i <= high; i++){
           if(arr[i] == 0){
               arr[i] = arr[low];
               arr[low] = 0;
               low++;
           }
           if(arr[i]==2){
               arr[i] = arr[high];
               arr[high] = 2;
               high--;
               i--;
           }
       }
    }
}
