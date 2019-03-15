package easy;

public class LongestCommonPrefix14 {

    public static String longestCommonPrefix(String[] strs) {
        if (strs.equals(null) || strs.length == 0) {
            return "";
        } else if (strs.length == 1) {
            return strs[0];
        }

        int min = strs[0].length();
        for (String s : strs) {
            if (s.length() < min) {
                min = s.length();
            }
        }
        int index = 0;
        while (index < min) {
            for (int i = 0; i < strs.length; i++) {

                if (strs[i].charAt(index) != strs[0].charAt(index)) {
                    if (index == 0) {
                        return "";
                    }
                    return strs[0].substring(0, index);
                }
            }
            index++;
        }
        return strs[0].substring(0, index);
    }

}
