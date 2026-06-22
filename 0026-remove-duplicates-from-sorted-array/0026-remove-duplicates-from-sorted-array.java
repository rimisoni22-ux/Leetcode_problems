class Solution {
    public int removeDuplicates(int[] nums) {

        // int[] res = new int[arr.length];

    //     res[0] = arr[0];

    //     int idx = 1;

    //     for (int i = 1; i < arr.length; i++) {
    //         int pre = arr[i - 1];
    //         int curr = arr[i];

    //         if (pre != curr) {
    //             res[idx] = curr;
    //             idx++;
    //         }
    //     }

    //     return idx;
    // }



        if (nums.length == 0) {
            return 0;
        }

        int idx = 1;

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[idx - 1]) {
                nums[idx] = nums[i];
                idx++;
            }
        }

        return idx;



       
    }

}
    