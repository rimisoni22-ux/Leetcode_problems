class Solution {
    public int majorityElement(int[] nums) {
        int n = nums.length;
        HashMap<Integer,Integer> map = new HashMap<>();
         for(int i=0;i<n;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);

         }
          for(Integer key:map.keySet()){
            if(map.get(key)>n/2){
                return key;
            }

          }
          return -1;
    }
}






































        // int n = nums.length;
        // int count = 1;
        // int majority = nums[0]; // Assume first element as candidate

        // // Phase 1: Find potential majority candidate
        // for (int i = 1; i < n; i++) {
        //     if (nums[i] == majority) {
        //         count++;
        //     } else {
        //         count--;
        //         if (count == 0) {
        //             majority = nums[i];
        //             count = 1;
        //         }
        //     }
        // }

        // // Phase 2: Verify the candidate
        // count = 0;
        // for (int i = 0; i < n; i++) {
        //     if (nums[i] == majority) {
        //         count++;
        //     }
        // }

        // // Return the element if it occurs more than n/2 times
        // if (count > n / 2)
        //     return majority;
        // else
        //     return -1; // No majority element found
//     }
// }