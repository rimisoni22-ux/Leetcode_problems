
class Solution {
    public int lengthOfLIS(int[] nums) {

        int n = nums.length;

        int[] tails = new int[n];
        int size = 0;

        for(int i = 0; i < n; i++) {

            int left = 0;
            int right = size;

            while(left < right) {

                int mid = left + (right - left) / 2;

                if(tails[mid] < nums[i]) {
                    left = mid + 1;
                }
                else {
                    right = mid;
                }
            }

            tails[left] = nums[i];

            if(left == size) {
                size++;
            }
        }

        return size;
    }
}
