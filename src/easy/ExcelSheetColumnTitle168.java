package easy;

public class ExcelSheetColumnTitle168 {

    public static String convertToTitle(int n) {

        String ret = "";
        while (n > 0) {
            ret = (char) ((n - 1) % 26 + 'A') + ret;
            n = (n - 1) / 26;
        }
        return ret;

    }

}
