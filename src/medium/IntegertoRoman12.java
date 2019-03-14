package medium;

public class IntegertoRoman12 {

    //AC,faster than 91.35%
    //讨巧的O(1)
    public static String intToRoman(int num) {

        if (num < 0 || num > 3999) {
            return "";
        }

        String a4[] = {"", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX"};
        String a3[] = {"", "X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC"};
        String a2[] = {"", "C", "CC", "CCC", "CD", "D", "DC", "DCC", "DCCC", "CM"};
        String a1[] = {"", "M", "MM", "MMM"};

        StringBuilder sb = new StringBuilder();

//        for (int i = 1000; i > 0; i = i / 10 ){
//            sb.append(a1[num / i]);
//
//            num = num % i;
//        }

        sb.append(a1[num / 1000]);
        num = num % 1000;

        sb.append(a2[num / 100]);
        num = num % 100;

        sb.append(a3[num / 10]);
        num = num % 10;

        sb.append(a4[num]);


        return sb.toString();
    }

    //写的更好一点，抄了一个更快的，类似于12题，依次减
    //faster than 97.29%
    public static String intToRoman1(int num) {
        if (num < 0 || num > 3999) {
            return "";
        }
        String[] romans = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
        int[] values = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        StringBuilder sb = new StringBuilder();

        for (int i = 0; num > 0; i++) {
            while (num >= values[i]) {
                num -= values[i];
                sb.append(romans[i]);
            }
        }
        return sb.toString();
    }
}
