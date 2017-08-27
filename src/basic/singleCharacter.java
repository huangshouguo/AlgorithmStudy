package basic;

import java.util.HashMap;
import java.util.Map;

/**
 * 找出给定字符串中第一个只出现一次的字符
 */

public class singleCharacter {

    public static char findFirstSingleCharacter(String data) {
        char result = 0;

        if (data != null && data.length() > 0) {
            Map<Character, Integer> t = new HashMap<>();
            for (int i = 0; i < data.length(); i++) {
                char c = data.charAt(i);
                if (t.containsKey(c)) {
                    Integer integer = t.get(c);
                    t.put(c, ++integer);
                } else {
                    t.put(c, 1);
                }
            }

            System.out.println("map = " + t);

            for (Map.Entry<Character, Integer> entry : t.entrySet()) {
                if (entry.getValue() == 1) {
                    result = entry.getKey();
                    break;
                }
            }
        }

        return result;
    }

    public static void main(String[] args) {
        char ret = findFirstSingleCharacter("abdcacbe");
        System.out.println("result = " + ret);

    }
}
