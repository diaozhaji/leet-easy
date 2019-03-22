package easy;

public class LengthofLastWord58 {

    public static int lengthOfLastWord(String s) {

        if (s == null || s.length() == 0) {
            return 0;
        }
        if (!s.contains(" ")) {
            return s.length();
        }
        s = s.trim();
        String[] strs = s.split(" ");
        return strs[strs.length - 1].length();
    }


}
