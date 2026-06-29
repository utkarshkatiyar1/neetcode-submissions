class Solution {
    public int maxProfit(int[] prices) {
        int minIndex=0, sum=0;
        for(int i=0; i<prices.length; i++){
            if(prices[i]<prices[minIndex]){
                minIndex=i;
            }
            if(prices[i]-prices[minIndex]>sum) sum=prices[i]-prices[minIndex];
        }
        return sum;
    }
}
