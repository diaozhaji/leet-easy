package easy;

import java.util.HashMap;
import java.util.Map;

public class RomantoInteger13 {

    private static Map<Character, Integer> map = new HashMap() {
        {
            put('I', 1);
            put('V', 5);
            put('X', 10);
            put('L', 50);
            put('C', 100);
            put('D', 500);
            put('M', 1000);
        }
    };

    public static int romanToInt(String s) {

        int r = 0;
        int i = s.length() - 1;
        r = map.get(s.charAt(i));
        if (s.length() < 2) {
            return r;
        }

        for (i = s.length() - 2; i >= 0; i--) {

            if (map.get(s.charAt(i)) >= map.get(s.charAt(i + 1))) {
                r += map.get(s.charAt(i));
            } else {
                r -= map.get(s.charAt(i));
            }


        }
        return r;
    }
}
