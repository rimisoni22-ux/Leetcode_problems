class Solution {
    public int primePalindrome(int n) {
        if (n >= 8 && n <= 11) {
            return 11;
        }
        for (int x = 1; x < 100000; x++) {

            int palindrome = buildPalindrome(x);

            if (palindrome >= n && isPrime(palindrome)) {
                return palindrome;
            }
        }
        return -1;
    }
    private int buildPalindrome(int x) {
        int result = x;
        x /= 10;

        while (x > 0) {
            result = result * 10 + x % 10;
            x /= 10;
        }
        return result;
    }
    private boolean isPrime(int num) {
        if (num < 2) {
            return false;
        }
        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}