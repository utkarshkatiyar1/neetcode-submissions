class Solution {
    public void sortColors(int[] nums) {
        // int x=0, y=0;
        // for(int i=0; i<nums.length; i++){
        //     if(nums[i]==0) x++;
        //     else if(nums[i]==1) y++;
        // }
        // for(int i=0; i<nums.length; i++){
        //     if(i<x) nums[i]=0;
        //     else if(i>=x+y) nums[i]=2;
        //     else nums[i]=1;
        // }

        int low = 0;
        int mid = 0;
        int high = nums.length - 1;

        while (mid <= high) {
            if (nums[mid] == 0) {
                int temp = nums[low];
                nums[low] = nums[mid];
                nums[mid] = temp;
                low++;
                mid++;
            } else if (nums[mid] == 1) {
                mid++;
            } else if (nums[mid] == 2) {
                int temp = nums[mid];
                nums[mid] = nums[high];
                nums[high] = temp;
                high--;
            }
        }
    }
}