public class BestTimeToBuyAndSellStock {
    public static int bestTimeToBuyAndSellStock(int []prices) {
        int minPrice = Integer.MAX_VALUE;
        int maxProfit = 0;

        for (int price : prices) {
            minPrice = Math.min(minPrice, price);//min price to buy
            int profit = price - minPrice;
            maxProfit = Math.max(maxProfit, profit);//max price to sell
        }

        return maxProfit;
    }
}
