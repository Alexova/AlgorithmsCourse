package slidingWindow;

import java.util.HashMap;
import java.util.Map;

class StringPermutation {
    public static boolean findPermutation(String str, String pattern) {
        Map<Character, Integer> patternMap = new HashMap<>();
        for (Character character : pattern.toCharArray()) {
            addCharacter(patternMap, character);
        }
        for (int windowStart = 0, windowEnd = 0; windowEnd < str.length(); windowEnd++) {
            Character character = str.charAt(windowEnd);
            if (!pattern.contains(character.toString())) {
                while(windowStart < windowEnd){
                    addCharacter(patternMap, str.charAt(windowStart++));
                }
                windowStart = windowEnd + 1;
            } else {
                if (!reduceOrFail(patternMap, character)) {
                    addCharacter(patternMap, str.charAt(windowStart));
                    windowStart++;
                }
                if (patternMap.isEmpty()) {
                    return true;
                }
            }
        }
        return false;
    }

    private static void addCharacter(Map<Character, Integer> map, Character character) {
        map.put(character, map.getOrDefault(character, 0) + 1);
    }

    private static boolean reduceOrFail(Map<Character, Integer> map, Character character) {
        if (!map.containsKey(character)) {
            return false;
        }
        Integer occurrences = map.get(character);
        if (occurrences == 1) {
            map.remove(character);
        } else {
            map.put(character, occurrences - 1);
        }
        return true;
    }
}