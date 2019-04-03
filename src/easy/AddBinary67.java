package easy;

public class AddBinary67 {

    //这个方法没调通啊
    public static String addBinary(String a, String b) {

        if (a == null || a.length() <= 0 || b == null || b.length() <= 0) {
            return null;
        }


        int c = 0;

        a = reverseString(a);
        b = reverseString(b);
        StringBuilder result = new StringBuilder();


        for (int i = 0; i < a.length(); i++) {

            c = getC(a.charAt(i), b.charAt(i), c);
            result.append(getSum(a.charAt(i), b.charAt(i), c));

        }


        return reverseString(result.toString());
    }


    private static String reverseString(String a) {

        if (a == null || a.length() == 0) {
            return a;
        }
        StringBuilder b = new StringBuilder();
        for (int i = a.length() - 1; i >= 0; i--) {
            b.append(a.charAt(i));
        }
        return b.toString();

    }

    private static int getSum(char a, char b, int c) {
        if (a == b) {
            return c;
        }
        return (c + 1) % 2;
    }

    private static int getC(char a, char b, int c) {
        if (a == "1".charAt(0) && b == "1".charAt(0)) {
            return 1;
        }
        if (a == "1".charAt(0) || b == "1".charAt(0)) {
            return (c + 1) % 2;
        }
        return c;

    }

    //二刷自己写的，faster than 99.92%
    public static String addBinary1(String a, String b) {
        int m = a.length();
        int n = b.length();
        int carry = 0;
        StringBuilder res = new StringBuilder();

        while (m > 0 && n > 0) {
            res.append((a.charAt(m - 1) - '0' + b.charAt(n - 1) - '0' + carry) % 2);
            carry = (a.charAt(m - 1) - '0' + b.charAt(n - 1) - '0' + carry) >= 2 ? 1 : 0;
            m--;
            n--;
        }
        if (m == 0 && n == 0 && carry == 1) {
            res.append(1);
        } else {

            while (m > 0) {
                res.append((a.charAt(m - 1) - '0' + carry) % 2);
                carry = (a.charAt(m - 1) - '0' + carry) >= 2 ? 1 : 0;
                m--;
            }
            while (n > 0) {
                res.append((b.charAt(n - 1) - '0' + carry) % 2);
                carry = (b.charAt(n - 1) - '0' + carry) >= 2 ? 1 : 0;
                n--;
            }

            if (carry == 1) {
                res.append(1);
            }
        }
        return reverseString(res.toString());
    }

}
