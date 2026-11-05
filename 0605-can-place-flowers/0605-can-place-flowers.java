class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {

        int count = 0;
        int left = 0;
        int right = 1;

        while (left < flowerbed.length) {
            if (flowerbed[left] == 0) {
                if ((left == 0 || flowerbed[left - 1] == 0) &&
                        (right == flowerbed.length || flowerbed[right] == 0)) {

                    flowerbed[left] = 1;
                    count++;
                }
            }

            if (count >= n) {
                return true;
            }

            left++;
            right++;
        }

        return false;
    }
}