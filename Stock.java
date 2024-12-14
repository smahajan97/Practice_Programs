class Solution {
    public int maxProfit(int[] prices) {
        
        int Buy = prices[0];
        int profit = 0;

        for(int i =  1 ; i < prices.length ; i++) {
            if(prices[i] < Buy) {
                Buy = prices[i];
            }
            else {
                int Curr_Profit = prices[i] - Buy;
                profit = Math.max(Curr_Profit, profit); 
            }
        }
        return profit;
        
     }   
}
public class First {
    public static void main(String[] args) {
        
        Solution solution = new Solution();

        int[] prices = {7, 1, 5, 3, 6, 4};

        int maxProfit = solution.maxProfit(prices);

        System.out.println("Maximum Profit: " + maxProfit);
    }
}
