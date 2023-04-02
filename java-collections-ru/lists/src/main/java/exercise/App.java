package exercise;

import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;

// BEGIN
class App {
    public static boolean scrabble(String chars, String word) {
        String normalizeWor = word.toLowerCase();
        List<String> listWord = new ArrayList<>(Arrays.asList(normalizeWor.split("")));
        List<String> listArgs = new ArrayList<>(Arrays.asList(chars.split("")));

        int count = 0;

        for (var ch : listWord) {
            if (listArgs.contains(ch)) {
                count += 1;
                listArgs.remove(ch);
            }
        }
        return word.length() == count;
    }
}
//END
