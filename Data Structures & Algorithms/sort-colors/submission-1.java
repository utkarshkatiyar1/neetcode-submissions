class Solution {
    public void sortColors(int[] nums) {
        int x=0, y=0;
        for(int i=0; i<nums.length; i++){
            if(nums[i]==0) x++;
            else if(nums[i]==1) y++;
        }
        for(int i=0; i<nums.length; i++){
            if(i<x) nums[i]=0;
            else if(i>=x+y) nums[i]=2;
            else nums[i]=1;
        }
        Arrays.toString(nums);      
    }
}