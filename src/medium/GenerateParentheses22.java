package medium;

import easy.ValidParentheses20;

import java.util.ArrayList;
import java.util.List;

public class GenerateParentheses22 {

    public static List<String> generateParenthesis(int n) {

        String[] table = {"((", "()", ")(", "))"};


        List<String> result = new ArrayList<>();
        generateParenthesis(result, 0, n, "", table);

        return result;
    }

    public static void generateParenthesis(List<String> result, int index,
                                    int n, String curr, String[] table) {

        if (index == n) {
            if (ValidParentheses20.isValid(curr)) {
                result.add(curr);
            }
            return;
        }

        for (int i = 0; i < table.length; i++) {
            curr = curr + table[i];
            generateParenthesis(result, index +1, n, curr, table);
        }

    }
}
