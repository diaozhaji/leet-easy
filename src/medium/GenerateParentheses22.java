package medium;

import easy.ValidParentheses20;

import java.util.ArrayList;
import java.util.List;

public class GenerateParentheses22 {

    //利用20题的判断+回溯的算法，可以构造所有值，并且排除错误答案
    //但是性能极差
    //faster than 5.27%
    public static List<String> generateParenthesis(int n) {

        String[] table = {"((", "()", ")(", "))"};


        List<String> result = new ArrayList<>();
        generateParenthesis(result, 0, n, "", table);

        return result;
    }

    public static void generateParenthesis(List<String> result, int index,
                                           int n, String curr, String[] table) {

        if (index == n) {
            if (isValid(curr)) {//因为只有()两种，这个地方可以简化
                result.add(curr);
            }
            return;
        }

        for (int i = 0; i < table.length; i++) {
            String temp = curr + table[i];

            generateParenthesis(result, index + 1, n, temp, table);
        }

    }

    //只换一个判断，提高了一点点，用char应该会快些
    //faster than 6.63%
    public static boolean isValid(String s) {
        int i = 0;
        int balance = 0;
        while (i < s.length()) {
            if (s.charAt(i) == '(') {
                balance++;
            } else {
                balance--;
            }
            if (balance < 0) {
                return false;
            }
            i++;
        }
        return balance == 0;
    }
}
