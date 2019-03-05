public class AddBinary67 {


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
        for (int i = 0; i < a.length(); i++) {
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

}
