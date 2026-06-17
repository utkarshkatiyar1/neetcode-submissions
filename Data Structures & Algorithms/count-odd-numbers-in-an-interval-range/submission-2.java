class Solution {
    public int countOdds(int low, int high) {
        int num=0;
        int sum = high - low;

        if(high%2==0 && low%2==0) num=sum/2;
        else if(high%2!=0 && low%2!=0) num=(sum/2)+1;
        else num=(sum+1)/2;
      
        return num;
    }
}