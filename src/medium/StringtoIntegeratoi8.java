package medium;

public class StringtoIntegeratoi8 {
    public static int myAtoi(String str) {
        //判空
        if (str == null || str.length() == 0) {
            return 0;
        }
        //去空格
        str = str.trim();
        //再判空
        if (str.length() == 0) {
            return 0;
        }
        //+ - 号
        int flag = 1;
        int index = 0;
        double result = 0;
        if (str.charAt(0) == '-') {
            flag = -1;
            index++;
        } else if (str.charAt(0) == '+') {
            flag = 1;
            index++;
        }
        //计数
        while (index < str.length()) {
            if (str.charAt(index) >= '0' && str.charAt(index) <= '9') {
                result = result * 10 + str.charAt(index) - '0';
            } else {
                break;
            }
            index++;
        }
        //int边界判断
        if (result > Integer.MAX_VALUE && flag == 1) {
            return (int) result;
        } else if (flag == -1 && (result * flag) < Integer.MIN_VALUE) {
            return (int) (result * flag);
        } else {
            return (int) (result * flag);
        }

    }
}
