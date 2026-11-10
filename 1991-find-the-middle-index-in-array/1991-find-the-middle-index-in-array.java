class Solution {
    public int findMiddleIndex(int[] nums) {


        int totalSum = 0;
        int leftSum = 0;

        // Calculate total sum
        for (int i = 0; i < nums.length; i++) {
            totalSum += nums[i];
        }

        for (int i = 0; i < nums.length; i++) {

            if (2 * leftSum + nums[i] == totalSum) {
                return i;
            }

            leftSum += nums[i];
        }

        return -1;
    }
}
        

 