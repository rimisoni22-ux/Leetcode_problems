class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        int n = nums.length;
        int right = 0;
        int left = 0;
        int prod = 1;
        int count = 0;
        if (k <= 1)
            return 0;
        while (right < n) {
            prod *= nums[right];
            while (prod >= k) {
                prod /= nums[left];
                left++;
            }
            count = count + right - left + 1;
            right++;
        }
        return count;

    }
}