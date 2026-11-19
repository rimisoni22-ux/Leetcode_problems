
class Solution {
    public int heightChecker(int[] heights) {
        int[] count = new int[101];
        // Count the frequency of each height
        for (int h : heights) {
            count[h]++;
        }
        int result = 0;
        int index = 0;
        // Compare original heights with expected sorted order
        for (int height = 1; height <= 100; height++) {
            while (count[height] > 0) {
                if (heights[index] != height) {
                    result++;
                }
                index++;
                count[height]--;
            }
        }
        return result;
    }
}
