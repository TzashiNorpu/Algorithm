package algo.tzashinorpu.ThirdRound.Chapter12;

public class maxProfit_123 {
    public int maxProfit(int[] prices) {
        // 两笔交易
        // 买入、买入卖出、买入卖出买入、买入卖出买入卖出
        int buy1 = -prices[0];
        int onrTransaction = 0;
        int oneHalfTransaction = -prices[0];
        int twoTransaction = 0;
        int len = prices.length;
        for (int i = 1; i < len; i++) {
            buy1 = Math.max(buy1, -prices[i]);
            onrTransaction = Math.max(onrTransaction, buy1 + prices[i]);
            oneHalfTransaction = Math.max(oneHalfTransaction, onrTransaction - prices[i]);
            twoTransaction = Math.max(twoTransaction, oneHalfTransaction + prices[i]);
            System.out.printf("i=%d,buy1=%d,onrTransaction=%d,oneHalfTransaction=%d,twoTransaction=%d\n", i, buy1, onrTransaction, oneHalfTransaction, twoTransaction);
        }
        return twoTransaction;
    }
}
