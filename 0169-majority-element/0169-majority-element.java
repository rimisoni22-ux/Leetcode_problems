// class Solution {
//     public int majorityElement(int[] nums) {
        //bruete force approach
        // int n = nums.length;
        // for(int i=0;i<n;i++){
        //     int count =0;
        //     // howmany times nums[i] appears
        //      for(int j =0;j<n;j++){
        //         if(nums[i]==nums[j]){
        //             count++;
        //         }
        //      }
        //      if(count>n/2){ // 3 appears more then n/2 times 
        //         return nums[i];
        //      }            
        // }
        // return -1;
        /// better solution--Hashing--
    
class Solution {
    public int majorityElement(int[] nums) {
        int candidate = 0;
        int balance = 0;

        for (int value : nums) {
            if (balance == 0) {
                candidate = value;
            }

            if (value == candidate) {
                balance++;
            } else {
                balance--;
            }
        }

        return candidate;
    }
}





