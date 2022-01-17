package twoPointers;

import java.util.Arrays;

class TripletSumCloseToTarget {

    public static int searchTriplet(int[] arr, int targetSum) {
        if(arr == null || arr.length < 3) {
            throw new IllegalArgumentException();
        }
        int delta = Integer.MAX_VALUE;

        Arrays.sort(arr);
        for (int i = 0; i < arr.length; i++){
            int left = i + 1;
            int right = arr.length - 1;
            while(left < right){
                int sum = arr[i] + arr[left] + arr[right];
                if(sum == targetSum){
                    return targetSum;
                }
                if(Math.abs(targetSum - sum) < Math.abs(delta)){
                    delta = targetSum - sum;
                }
                if(sum > targetSum){
                    right--;
                } else {
                    left++;
                }
            }
        }
        return targetSum - delta;
    }
}