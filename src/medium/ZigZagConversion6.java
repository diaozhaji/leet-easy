package medium;

public class ZigZagConversion6 {

    //列数m问题，一直WA
    //faster than 9.54%，而且性能很差
    public static String convert(String s, int numRows) {
        if (s.equals("") || s.length() == 0) {
            return "";
        }
        if (numRows == 1 || s.length() <= numRows) {
            return s;
        }
        int m = 0;//列
        if (s.length() < (2 * numRows - 2)) {
            m = numRows - 1;
        } else if (s.length() % (2 * numRows - 2) == 0) {
            m = s.length() / 2;
        } else {
            m = (s.length() / (2 * numRows - 2) + 1) * (numRows - 1);

        }
        int n = numRows;//行
        int index = 0;//输入字符串的index

        char[][] zz = new char[n][m];

        for (int i = 0; i < m; i++) {
            //i 列
            if (i % (n - 1) == 0) {
                if (index >= s.length()) {
                    break;
                }
                for (int j = 0; j < n; j++) {
                    //j 行
                    zz[j][i] = s.charAt(index++);
                    if (index >= s.length()) {
                        break;
                    }
                }
            } else {
                for (int j = 0; j < n; j++) {
                    if (index >= s.length()) {
                        break;
                    }
                    if ((i + j) % (n - 1) == 0) {
                        zz[j][i] = s.charAt(index++);
                        if (index >= s.length()) {
                            break;
                        }
                    }
                }
            }

        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (zz[i][j] != '\0') {
                    sb.append(zz[i][j]);
                }
            }
        }

        return sb.toString();
    }

    //抄了一个代码，没看懂
    //faster than 99.71%
    public static String convert1(String s, int numRows) {

        if (numRows == 1) {
            return s;
        }
        StringBuilder rel = new StringBuilder();
        int l = s.length();
        int add = 2 * numRows - 2;
        for (int i = 0; i < numRows; i++) {
            for (int j = i; j < l; j += add) {
                rel.append(s.charAt(j));
                int flag = j + 2 * (numRows - 1 - i);
                if (i != 0 && i != numRows - 1 && flag < l) {
                    rel.append(s.charAt(flag));
                }
            }
        }
        return rel.toString();
    }


}
