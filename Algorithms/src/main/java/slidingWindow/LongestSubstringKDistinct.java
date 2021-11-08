package slidingWindow;

import java.util.HashMap;

public class LongestSubstringKDistinct {

    public static int findLength(String str, int k) {
        int maxLength = 0;
        int windowEnd = 0;
        HashMap<Character, Integer> map = new HashMap<>();
        for (int windowStart = 0; windowEnd < str.length(); windowStart++, windowEnd++) {
            addOrIncrease(map, str.charAt(windowEnd));
            if (map.keySet().size() <= k) {
                maxLength = Math.max(maxLength, windowEnd - windowStart + 1);
                windowStart--;
            }
            if (map.keySet().size() > k) {
                remove(map, str.charAt(windowStart));
            }
        }
        return maxLength;
    }

    private static void remove(HashMap<Character, Integer> map, char c) {
        int occurences = map.get(c);
        if (occurences == 1) {
            map.remove(c);
        } else {
            map.put(c, occurences - 1);
        }
    }

    private static void addOrIncrease(HashMap<Character, Integer> map, Character c) {
        int occurences = map.getOrDefault(c, 0);
        map.put(c, occurences + 1);
    }
}
