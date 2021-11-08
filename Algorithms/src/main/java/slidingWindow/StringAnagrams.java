package slidingWindow;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class StringAnagrams {
    public static List<Integer> findStringAnagrams(String str, String pattern) {
        List<Integer> resultIndices = new ArrayList<>();
        Map<Character, Integer> charFrequencyMap = new HashMap<>();
        for (Character character : pattern.toCharArray()) {
            addChar(charFrequencyMap, character);
        }
        for (int windowStart = 0, windowEnd = 0; windowEnd < str.length(); windowEnd++, windowStart++) {
            Character character = str.charAt(windowEnd);
            if (!pattern.contains(character.toString())) {
                while (windowStart < windowEnd) {
                    addChar(charFrequencyMap, str.charAt(windowStart++));
                }
            } else {
                if (charFrequencyMap.containsKey(character)) {
                    removeChar(charFrequencyMap, character);
                    if (charFrequencyMap.isEmpty()) {
                        resultIndices.add(windowStart);
                        addChar(charFrequencyMap, str.charAt(windowStart));
                    } else {
                        windowStart--;
                    }
                } else {
                    addChar(charFrequencyMap, str.charAt(windowStart));
                    windowEnd--;
                }
            }
        }
        return resultIndices;
    }

    private static void addChar(Map<Character, Integer> map, Character character) {
        map.put(character, map.getOrDefault(character, 0) + 1);
    }

    private static void removeChar(Map<Character, Integer> map, Character character) {
        Integer occurences = map.get(character);
        if (occurences == 1) {
            map.remove(character);
        } else {
            map.put(character, occurences - 1);
        }
    }
}
