class Solution {
    public int[] sortArrayByParity(int[] nums) {



    
        int slow = 0;

        for (int fast = 0; fast < nums.length; fast++) {

            if (nums[fast] % 2 == 0) {

                int temp = nums[slow];
                nums[slow] = nums[fast];
                nums[fast] = temp;

                slow++;
            }
        }

        return nums;
    }
}
    //     int n = nums.length;
    //   int left =0;
    //   int right = nums.length-1;
    //    while(left<=right){
    //      if(nums[left] % 2 == 0){
    //         left++;
    //      } else{
    //         int temp =nums[right];
    //         nums[right]=nums[left];
    //         nums[left]= temp;
    //         right--;
    //      }
    //    }
//          return nums;
        
//     }
// }