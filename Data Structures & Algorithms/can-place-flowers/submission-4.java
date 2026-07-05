class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int count=0, num=flowerbed.length;
        if(num==1) {
            if(n>0) return flowerbed[0]==0;
            else return true;
        }
        if(flowerbed[0]==0 && flowerbed[1]==0){
            flowerbed[0]=1;
            count++;
        }
        if(flowerbed[num-1]==0 && flowerbed[num-2]==0){
            flowerbed[num-1]=1;
            count++;
        }
        for(int i=1; i<num-1; i++){
            if(flowerbed[i]==0 && flowerbed[i-1]!=1 && flowerbed[i+1]!=1){
                flowerbed[i]=1;
                count++;
            }
        }
        if(n<=count) return true;
        return false;
    }
}