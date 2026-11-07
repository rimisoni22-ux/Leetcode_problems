class Solution {
    /**
     * Calculates the maximum area of water that can be contained.
     * Time Complexity: O(n)
     * Space Complexity: O(1)
     * * @param height An array representing the height of the bars.
     * @return The maximum area of water that can be contained.
     */
    public int maxArea(int[] height) {
        int maxarea =0;
        int right = height.length-1;
        int left =0;
        while(left<=right){
            int currheight = Math.min(height[right],height[left]);
            int currwidth = right-left;
            int currarea = currheight*currwidth;
            maxarea = Math.max(currarea,maxarea);
            if(height[left]<height[right]){
                left++;
            } else{
                right--;
            }
        }
        return maxarea;

    
    }
}