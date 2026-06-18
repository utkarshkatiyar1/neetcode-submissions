class Solution {
    public int lastStoneWeight(int[] stones) {
        Arrays.sort(stones);
        int l=stones.length;
        if(l==1) return 1;
            int x=stones[l-2];
            int y=stones[l-1];
                while(x>0){
                    x=stones[l-2];
                    y=stones[l-1];
                    stones[l-2]=0;
                    stones[l-1]=y-x;
                    Arrays.sort(stones);
                }
        return y;
    }
}
