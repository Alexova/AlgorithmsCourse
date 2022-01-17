package twoPointers;

import java.util.HashMap;
import java.util.Map;

/**
 * Given a pair
 */
public class PairWithTargetSum {

    public static int[] search(Integer[] arr, int targetSum) {
//        int start = 0;
//        int end = arr.length - 1;
//        while(start < end){
//            int sum = arr[start] + arr[end];
//            if(sum > targetSum){
//                end--;
//            } else if (sum < targetSum){
//                start++;
//            } else {
//                return new int[]{start, end};
//            }
//        }
        Map<Integer, Integer> map = new HashMap<>();
        for(int i=0; i < arr.length; i++){
            if(map.containsKey(targetSum - arr[i])){
                return new int[]{map.get(targetSum - arr[i]), i};
            } else {
                map.put(arr[i], i);
            }
        }
        return new int[]{-1, -1};
    }
}
