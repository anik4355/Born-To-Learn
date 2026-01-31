public class BuyAndSellStock
{
    public static void main(String[] args) {
//        int[] prices  = {7,1,5,3,6,4};
        int[] prices = {2,4,1};
        int profit = maxProfit(prices);
        System.out.println(profit);;
    }
    public static int maxProfit(int[] prices) {

        int buy = prices[0];
        int sell = prices[0];
        int profit = 0;
        for(int price : prices){
            if(price > sell){
                sell = price;
            }else if(price < buy){
                buy = price;
                sell = price;
            }
            if((sell - buy) > profit){
                profit = sell - buy;
            }
        }
        return profit ;
    }
}
