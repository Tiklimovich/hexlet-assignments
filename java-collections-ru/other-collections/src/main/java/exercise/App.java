package exercise;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

// BEGIN
class App {
    public static Map<String, String> genDiff(Map<String, Object> map1, Map<String, Object> map2) {
        Set<String> values = new TreeSet<>(map1.keySet());
        values.addAll(map2.keySet());
        Map<String, String> result = new LinkedHashMap<>();
        for(String key: values) {
            var data1 = map1.containsKey(key);
            var data2 = map2.containsKey(key);
            if (!data1) {
                result.put(key, "added");
            }
            else if (!data2) {
                result.put(key, "deleted");
            }
            else if (map1.get(key) == map2.get(key)) {
                result.put(key, "unchanged");
            }
            else
                result.put(key, "changed");
            }
        return result;
        }
    }

//END
