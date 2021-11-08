package slidingWindow;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
 * Given the list of words find substrings containing concatenation of all words in the array
 */
public class WordConcatenation {
    public static List<Integer> findWordConcatenation(String str, String[] words) {
        List<Integer> resultIndices = new ArrayList<Integer>();
        Map<String, Integer> wordFrequencyMap = new HashMap<>();
        for (String word : words) {
            int frequency = wordFrequencyMap.getOrDefault(word, 0);
            wordFrequencyMap.put(word, ++frequency);
        }
        int wordLength = words[0].length();
        int windowStart = 0;
        int nextStart = 0;
        int windowEnd = wordLength;
        int numWords = 0;
        while (windowEnd <= str.length()) {
            String word = str.substring(nextStart, windowEnd);
            if (wordFrequencyMap.containsKey(word) && wordFrequencyMap.get(word) > 0) {
                numWords++;
                wordFrequencyMap.put(word, wordFrequencyMap.get(word) - 1);
                if (numWords == words.length) {
                    resultIndices.add(windowStart);
                    wordFrequencyMap.put(str.substring(windowStart, windowStart + wordLength), wordFrequencyMap.get(str.substring(windowStart, windowStart + wordLength)) + 1);
                    numWords--;
                    windowStart = windowStart + wordLength;
                }
                nextStart = nextStart + wordLength;
                windowEnd = windowEnd + wordLength;
            } else {
                if (numWords > 0) {
                    String first = str.substring(windowStart, windowStart + wordLength);

                    windowStart = windowStart + wordLength;
                    wordFrequencyMap.put(first, wordFrequencyMap.get(first) + 1);
                    numWords--;
                } else {
                    windowStart = windowStart + 1;
                }
                windowEnd = windowStart + wordLength;
                nextStart = windowStart;
            }
        }
        return resultIndices;
    }
}


