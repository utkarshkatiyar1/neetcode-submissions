class Solution {
    public boolean hasDuplicate(int[] nums) {
     List <Integer> list1 = new ArrayList<>();
     int i=0;
     Boolean isDup = false;
     while(i<nums.length){
        if(list1.contains(nums[i])){
            isDup=true;
            break;
        }
        else list1.add(nums[i]);
        i++;
     }     
     return isDup;


    }
}