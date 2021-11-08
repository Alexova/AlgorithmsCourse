package slidingWindow;

import java.util.HashMap;
import java.util.Map;

class MinimumWindowSubstring {
    public static String findSubstring(String str, String pattern) {
        Map<Character, Integer> charFrequencyMap = new HashMap<>();
        for(Character character: pattern.toCharArray()){
            charFrequencyMap.put(character, charFrequencyMap.getOrDefault(character, 0) + 1);
        }

        int match = 0;
        String responce = "";
        for(int windowStart = 0, windowEnd = 0; windowEnd < str.length(); windowEnd++) {
            Character character = str.charAt(windowEnd);
            if(charFrequencyMap.containsKey(character)) {
                int left = charFrequencyMap.get(character);
                if(left == 0) {
                    if(charFrequencyMap.containsKey(str.charAt(windowStart))) {
                        charFrequencyMap.put(str.charAt(windowStart), charFrequencyMap.get(str.charAt(windowStart)) + 1);
                        match--;}
                    windowStart++;

                    windowEnd--;
                } else {
                    charFrequencyMap.put(str.charAt(windowEnd), charFrequencyMap.get(str.charAt(windowEnd)) - 1);
                    match++;
                    if(match == pattern.length()){
                        int newLength = windowEnd - windowStart + 1;
                        if(newLength < responce.length() || responce.isEmpty()){
                            if(windowEnd == str.length() - 1) {
                                responce = str.substring(windowStart);
                            } else {
                                responce = str.substring(windowStart, windowEnd + 1);
                            }
                        }
                        if(charFrequencyMap.containsKey(str.charAt(windowStart))) {
                            charFrequencyMap.put(str.charAt(windowStart), charFrequencyMap.get(str.charAt(windowStart++)) + 1);
                            match--;
                        }
                        windowEnd--;
                    }
                }
            }
        }
        return responce;
    }
}