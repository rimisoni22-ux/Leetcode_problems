
class Solution {
    public int totalFruit(int[] fruits) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int left = 0;
        int maxLen = 0;
        for (int right = 0; right < fruits.length; right++) {

            // Add fruit into map
            map.put(fruits[right],
                map.getOrDefault(fruits[right], 0) + 1);

            // More than 2 distinct fruits
            while (map.size() > 2) {

                map.put(fruits[left],
                    map.get(fruits[left]) - 1);

                // Remove fruit if frequency becomes 0
                if (map.get(fruits[left]) == 0) {
                    map.remove(fruits[left]);
                }

                left++;
            }

            // Calculate maximum window size
            maxLen = Math.max(maxLen, right - left + 1);
        }

        return maxLen;
    }
}
