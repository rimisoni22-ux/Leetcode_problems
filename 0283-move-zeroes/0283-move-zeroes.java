
class Solution {
    public void moveZeroes(int[] nums) {
        //slow fast approach
        //slow pointer--Tracks the position where the next non-zero element should be placed.
        int slow = 0;
         //fast pointer for loop --Traverses every element in the array.
        for (int fast = 0; fast < nums.length; fast++) {
           
            if (nums[fast] != 0) {
                int temp = nums[fast];
                nums[fast] = nums[slow];
                nums[slow] = temp;

                slow++;
            }
        }
    }
}
