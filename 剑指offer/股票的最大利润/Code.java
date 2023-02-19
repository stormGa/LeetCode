package 剑指offer.股票的最大利润;

public class Code {

    public int maxProfit(int[] prices) {
        if (prices.length <= 1) {
            return 0;
        }
        int[] dp = new int[prices.length+1];
        dp[0] = 0;
        dp[1] = 0;
        int min = 0;
        for (int i = 2; i < dp.length; i++) {
            dp[i] = Math.max(dp[i - 1], prices[i-1] - prices[min]);
            if (prices[i-1] < prices[min]) {
                min = i-1;
            }
        }
        return dp[dp.length-1];
    }

    public static void main(String[] args) {
        int[] prices = {7,6,4,3,1};
        int i = new Code().maxProfit(prices);
        System.out.println(i);
    }
}
