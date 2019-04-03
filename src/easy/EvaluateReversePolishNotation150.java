package easy;

import java.util.Stack;

public class EvaluateReversePolishNotation150 {


    // faster than 77.60%
    public static int evalRPN(String[] tokens) {

        if (tokens.length == 1) {
            return Integer.parseInt(tokens[0]);
        }

        Stack<Integer> stack = new Stack<>();
        int res = 0;
        int a, b;
        for (int i = 0; i < tokens.length; i++) {
            if (isInt(tokens[i])) {
                stack.push(Integer.parseInt(tokens[i]));
            } else {
                b = stack.pop();
                a = stack.pop();//一定要注意除数和被除数的位置！！
                res = count(a, b, tokens[i].charAt(0));
                stack.push(res);
            }
        }

        return res;
    }

    private static boolean isInt(String s) {
        return !(s.equals("+") || s.equals("-") || s.equals("*") || s.equals("/"));
    }

    private static int count(int a, int b, char deal) {

        switch (deal) {
            case '+':

                return a + b;
            case '-':
                return a - b;
            case '*':
                return a * b;
            case '/':
                return a / b;
            default:
                return 0;
        }
    }

}
