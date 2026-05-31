class Solution {
    public int maxProfit(int[] prices) {
        int maxProfit = 0;
        int smallest = prices[0];
        for(int i =0; i<prices.length; i++){
            if(prices[i]< smallest){
                smallest = prices[i];
            }
            else{
                int profit = prices[i] - smallest;
                maxProfit = Math.max(maxProfit, profit);
            }
        }
        return maxProfit;
    }
}
