class Solution {
    public int removeElement(int[] nums, int val) {
       int validElementIndex = 0;
        for(int currentElement : nums){
            if(currentElement != val){
                nums[validElementIndex] = currentElement;
                validElementIndex++;
            }
        }
        return validElementIndex;
    }
}