class Solution {
    /**
     * Calculates the maximum area of water that can be contained.
     * Time Complexity: O(n)
     * Space Complexity: O(1)
     * * @param height An array representing the height of the bars.
     * @return The maximum area of water that can be contained.
     */
    public int maxArea(int[] height) {
        int left = 0;
        int right = height.length - 1;
        int maxArea = 0;

        while (left < right) {
            // 1. Calculate current area
            // The height of the container is limited by the shorter line
            int currentHeight = Math.min(height[left], height[right]);
            int currentWidth = right - left;
            int currentArea = currentHeight * currentWidth;
            
            // 2. Update max area
            maxArea = Math.max(maxArea, currentArea);

            // 3. Move the pointer of the shorter line inward
            // Moving the shorter line gives the best chance to find a taller line
            // that compensates for the decreased width.
            if (height[left] < height[right]) {
                left++;
            } else {
                right--;
            }
        }

        return maxArea;
    }
}