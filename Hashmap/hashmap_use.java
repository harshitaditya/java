import java.util.*;

public class hashmap_use {
    public static void main(String args[]) {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("abc", 1);
        map.put("def", 2);
        System.out.println(map);
        System.out.println(map.size()); // it does not copy the key it just change the value. If we copy the same key
                                        // again and value different then it change only the value.
        if (map.containsKey("abc")) {
            System.out.println("has map");
        }
        if (map.containsKey("abc1")) {
            System.out.println("not has map");
        }
        int v = 0;
        if (map.containsKey("abc")) {
            v = map.get("abc");
            System.out.println(v);
        }
        int s = map.remove("def");
        System.out.println(s);

        Set<String> keys = map.keySet();
        for (String str : keys) {
            System.out.println(str);
        }

    }

}
