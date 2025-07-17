package dev.himanshu.StriverSDE.Arrays;

public class StockBuyAndSell {
    public static void main(String[] args) {

        int[] prices = {7,1,5,3,6,4};
        int maxProfit = maxProfit(prices);
        System.out.println(maxProfit);
    }

    public static int maxProfit(int[] prices) {
        int maxProfit = 0;
        int min = prices[0];


        for(int i=1; i< prices.length; i++){

            int cost = prices[i] - min;
            maxProfit = Math.max(cost, maxProfit);
            min = Math.min(min, prices[i]);

        }

        return maxProfit;
    }
}
