package slidingWindow;

public class MinSizeSubArraySum {
    /**
     * Given an array of positive numbers and a positive number ‘S,’
     * find the length of the smallest contiguous subarray whose sum is greater than or equal to ‘S’.
     * Return 0 if no such subarray exists.
     *
     * @param S   sum bigger of wich a sub array should be
     * @param arr array
     * @return 0 if total array sum is less then S
     */
    public static int findMinSubArray(int S, int[] arr) {
        int windowSizeMin = arr.length + 1;
        int windowStart = 0;
        int windowSum = 0;
        for (int windowEnd = 0; windowEnd < arr.length; windowEnd++) {
            windowSum = windowSum + arr[windowEnd];
            if (windowSum >= S) {
                windowSizeMin = Math.min(windowSizeMin, windowEnd - windowStart + 1);
                windowSum = windowSum - arr[windowStart] - arr[windowEnd];
                windowStart++;
                windowEnd--;
            }
        }

        return windowSizeMin > arr.length ? 0 : windowSizeMin;
    }

}
