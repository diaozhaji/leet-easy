package easy;

public class BestTimetoBuyandSellStock121 {

    //自己想的，一遍循坏其实就够用了，faster than 81.98%
    public static int maxProfit(int[] prices) {

        if (prices == null || prices.length == 0 || prices.length == 1) {
            return 0;
        }

        int min = prices[0];

        int dp[] = new int[prices.length];
        dp[0] = prices[0];
        for (int i = 1; i < prices.length; i++) {
            dp[i] = prices[i] - min;

            min = Math.min(min, prices[i]);
        }
        int max = 0;
        for (int i = 1; i < prices.length; i++) {
            max = Math.max(max, dp[i]);
        }


        return max;
    }


}
