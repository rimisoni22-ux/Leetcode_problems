class Solution {
    public void moveZeroes(int[] nums) {
        int j = 0;
         for(int i =0;i<nums.length;i++){
             // if we found 0 the move head other wise shift element by 0 and move our zero at the end one by ine 
            if(nums[i]!=0){
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                j++;
            }
         }
    }
}