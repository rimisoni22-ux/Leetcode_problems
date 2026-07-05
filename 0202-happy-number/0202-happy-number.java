class Solution {
    public boolean isHappy(int n) {
        int slow = n;
        int fast = n;

        do {
            slow = digitSquareSum(slow);              // move one step
            fast = digitSquareSum(digitSquareSum(fast));  // move two steps
        } while (slow != fast);

        return slow == 1; // if they meet at 1 → happy
    }

    private int digitSquareSum(int num) {
        int sum = 0;
        while (num > 0) {
            int digit = num % 10;
            sum += digit * digit;
            num /= 10;
        }
        return sum;
    }
}
