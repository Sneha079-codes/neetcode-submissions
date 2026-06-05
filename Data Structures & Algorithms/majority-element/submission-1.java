class Solution {
    public int majorityElement(int[] nums) {
        int n = nums.length;
        Arrays.sort(nums);
        int majorityElement = nums[n/2];
        return majorityElement;
    }
}