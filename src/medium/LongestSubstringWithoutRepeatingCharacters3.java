package medium;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class LongestSubstringWithoutRepeatingCharacters3 {

    //faster than 22.14% / less than 12.96%
    public static int lengthOfLongestSubstring(String s) {

        if (s.equals(null) || s.length() == 0) {
            return 0;
        }


        Set<Character> set = new HashSet<>();
        int max = 1;

        for (int i = 0; i < s.length() - 1; i++) {

            set.clear();
            for (int j = i; j < s.length(); j++) {
                if (set.contains(s.charAt(j))) {
                    break;
                } else {
                    set.add(s.charAt(j));
                    if (set.size() > max) {
                        max = set.size();
                    }
                }
            }
        }


        return max;
    }

    //抄了一个 faster than 63.07%,less than 7.84%
    //我的理解是set add clear等操作比同一个map 的换数字慢的多
    //而且左指针移动时，其实无需从头开始判断，而是直接利用了右指针
    public static int lengthOfLongestSubstring1(String s) {
        Map<Character, Integer> m = new HashMap<>();
        for (int i = 0; i < s.length(); ++i) {
            m.put(s.charAt(i), 0);
        }
        int l = 0, r = 0, res = 0;
        while (r < s.length() && l < s.length()) {
            if (l == r || m.get(s.charAt(r)) == 0) {
                m.put(s.charAt(r), m.get(s.charAt(r)) + 1);
                ++r;
            } else if (m.get(s.charAt(r)) >= 0) {
                m.put(s.charAt(l), m.get(s.charAt(l)) - 1);
                ++l;
            }
            res = Math.max(res, r - l);
        }
        return res;
    }

}
