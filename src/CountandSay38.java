public class CountandSay38 {

    public static String countAndSay(int n) {

        if (n == 1) {
            return "1";
        }

        return say(countAndSay(n - 1));
    }


    public static String say(String str) {

        if (str == null) {
            return "";
        } else if (str.length() == 1) {
            return "11";
        }

        int len = str.length();

        StringBuilder sb = new StringBuilder();


        for (int i = 0; i < len - 1; i++) {
            for (int j = i + 1; j < len; j++) {
                if (str.charAt(i) != str.charAt(j)) {
                    sb.append(j - i);
                    sb.append(str.charAt(i));
                    i = j - 1;
                    break;
                } else if (j == len - 1) {
                    sb.append(j - i + 1);
                    sb.append(str.charAt(j));
                    i = len;
                    break;
                }
            }

        }

        if (str.charAt(len - 2) != str.charAt(len - 1)) {
            sb.append(1);
            sb.append(str.charAt(len - 1));
        }


        return sb.toString();

    }


}
