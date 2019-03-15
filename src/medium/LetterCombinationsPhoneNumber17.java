package medium;

import java.util.ArrayList;
import java.util.List;

public class LetterCombinationsPhoneNumber17 {

    //回溯算法
    //抄的答案就是屌，faster than 100.00%
    public static List<String> letterCombinations(String digits) {

        //把table上的数字对应的字母列出来，当输入为2是，digits[2]就是2所对应的"abc"
        String[] table = new String[]
                {"", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
        List<String> list = new ArrayList<String>();
        letterCombinations(list, digits, "", 0, table);

        return list;

    }

    public static void letterCombinations(List<String> list, String digits, String cur,
                                          int index, String[] table) {
        //退出条件
        if (index == digits.length()) {
            if (cur.length() != 0) {
                list.add(cur);
            }
            return;
        }

        String abc = table[digits.charAt(index) - '0'];
        for (int i = 0; i < abc.length(); i++) {
            String next = cur + abc.charAt(i);
            letterCombinations(list, digits, next, index + 1, table);

        }

    }

}
