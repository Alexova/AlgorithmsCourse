package fastAndSlow;

public class HappyNumber {

    public static boolean find(int num) {
        int slow = num;
        int fast = num;
        do {
            slow = findSquaresSum(slow);
            fast = findSquaresSum(findSquaresSum(fast));
        } while (slow != fast);
        return slow == 1;
    }

    private static int findSquaresSum(int num){
        int tenths = Math.floorDiv(num, 10);
        int ones= num % 10;
        return tenths * tenths + ones * ones;
    }
}
