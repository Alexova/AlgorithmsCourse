package slidingWindow;

class MaxSumSubArrayOfSizeK {

    /**
     * Given an array of positive numbers and a positive number ‘k,’ find the maximum sum of any contiguous subarray of size ‘k’.
     *
     * @param k   sub array length
     * @param arr an array
     * @return maximum sum of sub array of certain length
     */
    public static int findMaxSumSubArray(int k, int[] arr) {
        int windowSum = firstWindowSum(k, arr);
        int maxSum = windowSum;
        for (int windowCount = 0; windowCount < arr.length - k; windowCount++) {
            windowSum = windowSum - arr[windowCount] + arr[windowCount + k];
            maxSum = Math.max(maxSum, windowSum);
        }
        return maxSum;
    }

    private static int firstWindowSum(int k, int[] arr) {
        int windowSum = 0;
        for (int i = 0; i < k && i < arr.length; i++) {
            windowSum = windowSum + arr[i];
        }
        return windowSum;
    }
}