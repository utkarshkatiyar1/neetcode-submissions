class Solution {
    public int maxProfit(int[] prices) {
        int min=prices[0], sum=0;
        for(int i=0; i<prices.length; i++){
            if(prices[i]<min){
                min=prices[i];
            }
            if(prices[i]-min>sum) sum=prices[i]-min;
        }
        return sum;
    }
}
