package slidingWindow;

import java.util.HashMap;
import java.util.Map;

public class CharacterReplacement {

    public static int findLength(String str, int k) {
        int maxLength = 0;
        Map<Character, Integer> characterCount = new HashMap<>();
        for(int windowStart = 0, windowEnd = 0; windowEnd < str.length(); windowStart++){
            int count = characterCount.getOrDefault(str.charAt(windowEnd), 0);
            characterCount.put(str.charAt(windowEnd), ++count);
            if(characterCount.size() > 2) {
                removeLetter(characterCount, str.charAt(windowStart));
                removeLetter(characterCount, str.charAt(windowEnd));
            } else {
                int wordLength = windowEnd - windowStart + 1;
                int secondChar = wordLength - count;
                if(count > k && secondChar > k){
                    removeLetter(characterCount, str.charAt(windowStart));
                } else {
                    maxLength = Math.max(maxLength, wordLength);
                    windowEnd++;
                    windowStart--;
                }
            }
        }
        return maxLength;
    }

    private static void removeLetter(Map<Character, Integer> characterCount, char c) {
        int count = characterCount.get(c);
        if(count == 1) {
            characterCount.remove(c);
        } else  {
            characterCount.put(c, count - 1);
        }
    }
}
