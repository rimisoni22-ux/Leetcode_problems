class Solution {
    public int maxFrequencyElements(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();

        // Step 1: Count the frequency of each element
        for (int i = 0; i < nums.length; i++) {
            if (!map.containsKey(nums[i])) {
                map.put(nums[i], 1);
            } else {
                map.put(nums[i], map.get(nums[i]) + 1);
            }
        }

        // Step 2: Find the maximum frequency
        int max = 0;

        for (int key : map.keySet()) {
            max = Math.max(max, map.get(key));
        }

        // Step 3: Add frequencies equal to maximum
        int count = 0;

        for (int key : map.keySet()) {
            if (map.get(key) == max) {
                count += map.get(key);
            }
        }

        return count;
    }
}


















        // int[] freq = new int[101];
        // int max = 0;
        // int count = 0;

        // for(int num : nums){
        //     freq[num]++;
        //     max = Math.max(max, freq[num]);   // update max
        // }

        // for(int i = 0; i < freq.length; i++){
        //     if(freq[i] == max){
        //         count += freq[i];
        //     }
        // }

        // return count;
  