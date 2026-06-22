class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int current = 0; current < nums.length; current++) {
            int previous = map.getOrDefault(nums[current], -1000000);
            if (current - previous <= k) {
                return true;
            }
            map.put(nums[current], current);
        }
        return false;
    }
}