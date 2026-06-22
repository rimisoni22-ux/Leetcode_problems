class Solution {
    public boolean isPalindrome(String s) {
        s = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        if (s.length() == 0 || s.length() == 1) {
            return true;
        }

        int start = 0;
        int end = s.length() - 1;
        while (start < end) {
            char newst = s.charAt(start);
            char newend = s.charAt(end);
            if (newst != newend) {
                return false;

            }
            start++;
            end--;

        }
        return true;
    }

}