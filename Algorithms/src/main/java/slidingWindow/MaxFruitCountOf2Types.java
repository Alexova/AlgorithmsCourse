package slidingWindow;

import java.util.HashMap;

public class MaxFruitCountOf2Types {
    public static int findLength(char[] arr) {
        int maxLength = 0;
        HashMap<Character, Integer> counter = new HashMap<>();
        int windowStart = 0;
        int windowEnd = 0;
        for (; windowEnd < arr.length; windowStart++, windowEnd++) {
            addElement(counter, arr[windowEnd]);
            if (counter.keySet().size() <= 2) {
                maxLength = Math.max(maxLength, windowEnd - windowStart + 1);
                windowStart--;
            } else {
                removeElement(counter, arr[windowStart]);
            }
        }
        return maxLength;
    }

    private static void removeElement(HashMap<Character, Integer> counter, Character c) {
        int occurrences = counter.get(c);
        if (occurrences == 1) {
            counter.remove(c);
        } else {
            counter.put(c, occurrences - 1);
        }
    }

    private static void addElement(HashMap<Character, Integer> counter, Character c) {
        int occurrences = counter.getOrDefault(c, 0);
        counter.put(c, occurrences + 1);
    }
}
