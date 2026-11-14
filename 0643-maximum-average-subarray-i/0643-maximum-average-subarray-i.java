class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int windowSum = 0;
        int maxSum = Integer.MIN_VALUE;
        int left = 0;
        int right = 0;
        while (right < nums.length) {
            // 1. Add current element
            windowSum += nums[right];
            // 2. Shrink window if size exceeds k
            if (right - left + 1 > k) {
                windowSum -= nums[left];
                left++;
            }
            // 3. Update maximum sum
            if (right - left + 1 == k) {
                maxSum = Math.max(maxSum, windowSum);
            }
            // 4. Move right pointer
            right++;
        }
        return (double) maxSum / k;
    }
}