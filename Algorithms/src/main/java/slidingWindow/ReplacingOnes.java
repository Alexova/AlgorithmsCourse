package slidingWindow;

class ReplacingOnes {
    /**
     * Given an array containing 0s and 1s, if you are allowed to replace no more than ‘k’ 0s with 1s, find the length
     * of the longest contiguous subarray having all 1s.
     * @param arr array of 0 and 1
     * @param k number of zeros allowed to be replaced
     * @return maximum length of an subarray 
     */
    public static int findLength(int[] arr, int k) {
        int maxLength = 0;
        int zerosCount = 0;
        for (int windowStart = 0, windowEnd = 0; windowEnd < arr.length; ) {

            if (zerosCount > k) {
                if (arr[windowStart] == 0) {
                    zerosCount--;
                }
                windowStart++;
            } else {
                if (arr[windowEnd] == 0) {
                    zerosCount++;
                }
                maxLength = Math.max(maxLength, windowEnd - windowStart + 1);
                windowEnd++;
            }
        }
        return maxLength;
    }
}