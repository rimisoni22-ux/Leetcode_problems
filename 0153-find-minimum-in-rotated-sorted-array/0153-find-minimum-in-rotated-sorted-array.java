
class Solution {
    public int findMin(int[] nums) {
        for (int j = 0; j < nums.length - 1; j++) {
            if (nums[j] > nums[j + 1]) {
                return nums[j + 1];
            }
        }
        return nums[0];
    }
}
