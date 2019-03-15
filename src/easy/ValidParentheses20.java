package easy;

import java.util.Stack;

public class ValidParentheses20 {
    //还是得用栈来做
    public static boolean isValid(String s) {
        if (s.equals(null)) {
            return false;
        }
        if (s.equals("")) {
            return true;
        }

        if (s.length() == 1) {
            return false;
        }

        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == "(".charAt(0)
                    || s.charAt(i) == "[".charAt(0)
                    || s.charAt(i) == "{".charAt(0)) {
                stack.push(s.charAt(i));
            } else {

                if (stack.isEmpty()) {
                    return false;
                }
                if (!isPair(stack.pop(), s.charAt(i))) {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }

    private static boolean isPair(char pre, char last) {
        if (pre == "(".charAt(0) && last == ")".charAt(0)
                || pre == "[".charAt(0) && last == "]".charAt(0)
                || pre == "{".charAt(0) && last == "}".charAt(0)) {
            return true;
        } else {
            return false;
        }

    }

    //性能很差，因为22题类似，所以二刷一下
    //又错了几次，不过最后 faster than 91.44%
    public static boolean isValid1(String s) {

        if (s.equals("")) {
            return true;
        }
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(' || s.charAt(i) == '[' || s.charAt(i) == '{') {
                stack.push(s.charAt(i));
            } else {
                if (stack.size() == 0) {
                    return false;
                }
                if (s.charAt(i) == ')' && stack.peek() != '(') {
                    return false;
                } else if (s.charAt(i) == ']' && stack.peek() != '[') {
                    return false;
                } else if (s.charAt(i) == '}' && stack.peek() != '{') {
                    return false;
                }
                stack.pop();
            }
        }
        return stack.empty();

    }

}
