class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int l=0, max=0;
        for(int i=0; i<nums.length; i++){
            if(nums[i]==1){
                l++;
            }
            else l=0;
        if(l>max) max=l;
        }
        return max;
    }
}