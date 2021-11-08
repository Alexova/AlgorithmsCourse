package slidingWindow;

import java.util.HashMap;

public class NoRepeatSubstring {
    /**
     * Given a string, find the length of the longest substring, which has all distinct characters.
     * @param str string to evaluate
     * @return for abcdeed return 5 for abcde
     */
    public static int findLength(String str) {
        HashMap<Character, Integer> letterToPosition = new HashMap<>();
        int maxLength = 0;
        for (int windowStart = 0, windowEnd = 0; windowEnd < str.length(); windowStart++, windowEnd++) {
            Character c = str.charAt(windowEnd);
            if (!letterToPosition.containsKey(c)) {
                letterToPosition.put(c, windowEnd);
                windowStart = windowStart - 1;
                maxLength = Math.max(maxLength, windowEnd - windowStart);
            } else {
                windowStart = letterToPosition.get(c);
                letterToPosition.put(c, windowEnd);
            }
        }
        return maxLength;
    }
}
