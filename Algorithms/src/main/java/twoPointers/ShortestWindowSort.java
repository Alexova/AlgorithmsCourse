package twoPointers;

/**
 * Find length of smallest window of array that needs being sorted to sort the whole array
 */
class ShortestWindowSort {

    public static int sort(int[] arr) {
        int right = arr.length - 1;
        int left = 0;
        while(arr[left] <= arr[left + 1]){
            left++;
            if(left == right){
                return 0;
            }
        }
        while (arr[right] >= arr[right - 1]){
            right --;
        }

        int subMax = Integer.MIN_VALUE;
        int subMin = Integer.MAX_VALUE;
        for(int i = left; i <= right; i++){
            subMax = Math.max(arr[i], subMax);
            subMin = Math.min(arr[i], subMin);
        }
        for(int i = right; i < arr.length; i++){
            if(arr[i] < subMax){
                right = i;
            }
        }
        for(int i = left; i >= 0; i--){
            if(arr[i] > subMin){
                left = i;
            }
        }
        return right - left + 1;
    }
}
