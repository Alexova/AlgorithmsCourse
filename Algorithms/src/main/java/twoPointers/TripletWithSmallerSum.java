package twoPointers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Given an unsorted array return a number of triplets where a[i] + a[j] + a[k] < target. i, j, k are idexes of array and are different
 */
public class TripletWithSmallerSum {
    public static int searchTriplets(int[] arr, int target) {
        if(arr == null || arr.length < 3) {
            throw new IllegalArgumentException();
        }
        Arrays.sort(arr);
        int count = 0;
        List<List<Integer>> triplets = new ArrayList<>();

        for(int i = 0; i <= arr.length - 3; i++){
            int right = arr.length - 1;
            int left = i + 1;
            while (left < right && left > i ){
                if(arr[i] + arr[left] + arr[right] < target){
                    count = count + right - left ;
                    left++;
                } else {
                    right--;
                }
            }
        }
        return count;
    }
}
