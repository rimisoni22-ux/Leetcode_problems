
import java.util.*;

class Solution {
    public int totalFruit(int[] fruits) {

        int n = fruits.length;
        int left = 0;
        int right = 0;
        int maxLen = 0;

        HashMap<Integer, Integer> mpp = new HashMap<>();

        while (right < n) {

            // Increase frequency
            mpp.put(fruits[right],
                mpp.getOrDefault(fruits[right], 0) + 1);

            // If distinct fruits are more than 2
            if (mpp.size() > 2) {

                mpp.put(fruits[left],
                    mpp.get(fruits[left]) - 1);

                // Remove fruit if frequency becomes zero
                if (mpp.get(fruits[left]) == 0) {
                    mpp.remove(fruits[left]);
                }

                left++;
            }

            // Update maximum window length
            if (mpp.size() <= 2) {
                maxLen = Math.max(maxLen, right - left + 1);
            }

            right++;
        }

        return maxLen;
    }
}
