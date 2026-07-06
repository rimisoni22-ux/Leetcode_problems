class Solution {
    public int countDigits(int num) {
        int count = 0;

        for (int i = num; i != 0; i /= 10) {
            int ld = i % 10;

            if (ld != 0 && num % ld == 0) {
                count++;
            }
        }

        return count;
    }
}