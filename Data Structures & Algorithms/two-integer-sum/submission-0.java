class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> l1 = new HashMap<>();
        int left = 0, right = 1, i = 0;
        int[] arr = new int[2];
        while (i < nums.length) {
            int complement = target - nums[i];
            if (l1.containsKey(complement)) {
                arr[0] = l1.get(complement);
                arr[1] = i;
                return arr;
            };
            l1.put(nums[i], i);
            i++;
        }
        return arr;
    }
}
