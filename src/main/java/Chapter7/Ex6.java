package Chapter7;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Ex6 {
    public static void main(String[] args) {
        Map<String, HashSet<Integer>> map = new HashMap<>();
        map.put("key1", new HashSet<>());
        map.get("key1").add(1);
        map.get("key1").add(2);

        processMap(map);
    }

    public static void processMap(Map<String, ? extends Set<Integer>> map) {
        for (Map.Entry<String, ? extends Set<Integer>> entry : map.entrySet()) {
            String key = entry.getKey();
            Set<Integer> value = entry.getValue();
            System.out.println("Key: " + key + ", Value: " + value);
        }
    }
}
