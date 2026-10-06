class Solution {
    public int removeDuplicates(int[] nums) {
        // int i =0;
        //  for(int j=i;j<nums.length;j++){
        //     if(nums[j]!=nums[i]){
        //         i++;
        //         nums[i] = nums[j];
        //     }
        //  }
        //   return i+1;
        //  int idx =1;
        //  for(int i=1;i<nums.length;i++){
        //     if(nums[i]!=nums[i-1]){
        //         nums[idx]=nums[i];
        //         idx++;
        //     }
        //  }
        //  return idx;
         int  i=0;
         for(int j=1;j<nums.length;j++){
            if(nums[j]!=nums[i]){
                nums[i+1]=nums[j];
                i++;
            }
         }
         return i+1;
        
    }
}