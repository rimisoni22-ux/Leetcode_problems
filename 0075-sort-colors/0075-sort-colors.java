// class Solution {
//     public void sortColors(int[] nums) {
//         //  int  curr =0;
        //  int left =0;
        //  int right =nums.length-1;
        //  while(curr<=right){
        //     if(nums[curr]==0){
        //         int temp = nums[curr];
        //         nums[curr] = nums[left];
        //         nums[left] = temp;
        //         left++;
        //         curr++;
        //     } else if(nums[curr]==1){
        //         curr++;
        //     } else{
        //           int temp = nums[curr];
        //         nums[curr] = nums[right];
        //         nums[right] = temp;
        //         right--;
        //     }
        //  }




        // Arrays.sort(nums);
     
class Solution {
    public void sortColors(int[] nums) {
        int k = 0;

        // First pass: move all 0s to the beginning
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                int temp = nums[i];
                nums[i] = nums[k];
                nums[k] = temp;
                k++;
            }
        }

        // Second pass: move all 1s after the 0s
        for (int i = k; i < nums.length; i++) {
            if (nums[i] == 1) {
                int temp = nums[i];
                nums[i] = nums[k];
                nums[k] = temp;
                k++;
            }
        }
    }
}

        
 