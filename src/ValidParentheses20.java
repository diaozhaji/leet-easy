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

}
