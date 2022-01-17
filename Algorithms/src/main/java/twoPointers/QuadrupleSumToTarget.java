package twoPointers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class QuadrupleSumToTarget {

    public static List<List<Integer>> searchQuadruplets(int[] arr, int target) {
        Arrays.sort(arr);
        List<List<Integer>> quadruplets = new ArrayList<>();
        if(arr == null || arr.length < 4 ){
            throw new IllegalArgumentException();
        }
        int n = arr.length - 1;
        for (int i = 0; i < arr.length - 4; i++){
            for(int j = i + 1; j < arr.length - 3; j++ ){
                for(int k = i + 2; k < n; k++){
                    int searched = target - arr[i] - arr[j] - arr[k];
                    while(arr[n] > searched){
                        n--;
                    }
                    if(arr[n] == searched){
                        quadruplets.add(Arrays.asList(arr[i], arr[j], arr[k], arr[n]));
                        n--;
                    }
                }
            }
        }
        return quadruplets;
    }
}
