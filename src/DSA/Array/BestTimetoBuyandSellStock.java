package DSA.Array;

public class BestTimetoBuyandSellStock {

/*    Given an array prices[] of length N, representing the prices of the stocks on different days,
      the task is to find the maximum profit possible by buying and selling the stocks on different days
      when at most one transaction is allowed.
       Note: Stock must be bought before being sold.
       */

    public static int maxProfit(int prices[], int n){

        int buyStockOnMinPrice = prices[0];
        int maxProfit = 0;

        for(int i = 0; i < n; i++){

            //checking for lower buy value
            if(buyStockOnMinPrice > prices[i])
                buyStockOnMinPrice = prices[i];

            //checking for max profit
            else if (prices[i]-buyStockOnMinPrice > maxProfit) {
                maxProfit = prices[i]-buyStockOnMinPrice;
            }
        }

        return maxProfit;
    }

    public static void main(String[] args) {
            int prices[] = { 7, 5, 8, 6, 4 };
            int n = prices.length;
            int max_profit = maxProfit(prices, n);
            System.out.println(max_profit);
    }
}
