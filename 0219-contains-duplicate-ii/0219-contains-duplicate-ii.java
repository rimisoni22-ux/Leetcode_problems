
import java.util.*;

class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {

        HashSet<Integer> set = new HashSet<>();

        int left = 0;
        int right = 0;

        while (right < nums.length) {

            // Remove elements outside the allowed window
            if (right - left > k) {
                set.remove(nums[left]);
                left++;
            }

            // Check duplicate
            if (set.contains(nums[right])) {
                return true;
            }

            // Add current element
            set.add(nums[right]);

            right++;
        }

        return false;
    }
}
