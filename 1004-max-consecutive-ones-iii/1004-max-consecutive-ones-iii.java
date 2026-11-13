class Solution {
    public int longestOnes(int[] nums, int k) {
        int right =0;
        int left =0;
        int zeros =0;
        int maxlen =0;
        int n = nums.length;
      
         while(right<n){
            if(nums[right]==0){
                zeros++;
            }
            if(zeros>k){
                if(nums[left]==0){
                    zeros--;
                    
                }
                left++;
            }
         
               int  length = right-left+1;
                maxlen = Math.max(length,maxlen);
                 right++;
            
           
         }
         return maxlen;
        
    }
}