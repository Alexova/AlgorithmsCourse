package twoPointers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Find all unique triplets, that sum up to 0.
 */
public class TripletSumToZero {

    public static List<List<Integer>> searchTriplets(int[] arr) {
        List<List<Integer>> triplets = new ArrayList<>();
        if(arr == null || arr.length < 3) {
            throw new IllegalArgumentException();
        }
        Arrays.sort(arr);
        for (int i = 0; i <= arr.length - 3; i++){
                addTriplets(i,arr , triplets);
                if(arr[i] == arr[i + 1]){
                    i++;
                }
        }
        return triplets;
    }

    private static void addTriplets(int i, int[] arr, List<List<Integer>> triplets) {
        int left = i + 1;
        int right = arr.length - 1;
        while(left < right) {
            int searched = -arr[i] - arr[left];
            if (arr[right] == searched) {
                if(left >= right){
                    break;
                }
                triplets.add(Arrays.asList(arr[i], arr[left], arr[right]));
                left++;
                while (left > 0 && left < arr.length && arr[left] == arr[left - 1]){
                    left++;
                }
                while (right > 0 && right < arr.length && arr[right] == arr[right - 1]){
                    right--;
                }

            }
            if(arr[right] < searched){
                left++;
            }
            if (arr[right] > searched) {
                right--;
            }
        }
    }
}