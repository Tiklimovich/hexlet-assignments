package exercise;

import java.util.HashMap;
import java.util.Map;

// BEGIN
class App {
    public static Map<String, Integer> getWordCount(String sentence) {
        if (sentence.length() == 0) {
            return new HashMap<>();
        }
        String[] words = sentence.split(" ");
        Map<String, Integer> wordOfSentence = new HashMap<>();
        for (String word: words) {
            if (wordOfSentence.containsKey(word)) {
                wordOfSentence.put(word, (wordOfSentence.get(word) + 1));
            } else {
                wordOfSentence.put(word, 1);

            }
        }
        return wordOfSentence;
    }
    public static String toString(Map<String, Integer> wordOfString) {
        if (wordOfString.isEmpty()) {
            return "{}\n";
        } else {
            var result = new StringBuilder();
            result.append("{\n");
            for (String key:wordOfString.keySet()) {
                result.append("  " + key + ": " + wordOfString.get(key) + "\n");
            }
            result.append("}\n");
            return result.toString();
        }
    }
}
//END
