package twoPointers;

/**
 * Given an array of sorted numbers (may be negative) return sorted array of squares of those numbers.
 */
public class SortedArraySquares {

    public static int[] makeSquares(int[] arr) {
        int[] squares = new int[arr.length];
        int left = 0;
        int right = arr.length - 1;

        while (right > left) {
            int leftSquare = arr[left] * arr[left];
            int rightSquare = arr[right] * arr[right];
            if (rightSquare > leftSquare) {
                squares[right - left] = rightSquare;
                right--;
            } else {
                squares[right - left] = leftSquare;
                left++;
            }
        }
        return squares;
    }

}
