public class BuyAndSellStock_2 {
    public static void main(String[] args) {
        int[] stock = {7,10,15};
        int profit = maxProfit(stock);
        System.out.println(profit);

    }
    public static int maxProfit(int[] prices) {
//        if(prices.length<= 1) return 0;
        int buy = prices[0];
        int sell = prices[0];
        int profit  = 0;
        for(int price : prices){
            if(price< buy){
                buy = price;
                sell = price;
            }else if(price > sell){
                sell = price;
                profit = profit + (sell - buy);
                buy = price;
            }
        }


        return profit;
    }
}
