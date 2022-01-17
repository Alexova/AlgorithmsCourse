package twoPointers;

/**
 * Given an array return number of non-duplicate elements and a sub-array. No extra memory should be used.
 * The beginning of array should contain sorted sub-array of non-duplicates
 */
public class RemoveDuplicates {
    public static int remove(int[] arr) {
        int subArrayLength = 1;
        for( int i = 1; i < arr.length; i++){
            if(arr[i] != arr[subArrayLength - 1]) {
                arr[subArrayLength++] = arr[i];
            }
        }
        return subArrayLength;
    }
}
