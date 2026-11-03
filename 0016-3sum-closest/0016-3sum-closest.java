class Solution {
    public int threeSumClosest(int[] arr, int target) {

        Arrays.sort(arr);

        int n = arr.length;
        int closest = arr[0] + arr[1] + arr[2];

        for (int i = 0; i < n - 2; i++) {

            int left = i + 1;
            int right = n - 1;

            while (left < right) {

                int sum = arr[i] + arr[left] + arr[right];

                // Update closest sum
                if (Math.abs(sum - target) < Math.abs(closest - target)) {
                    closest = sum;
                }

                if (sum < target) {
                    left++;
                } 
                else if (sum > target) {
                    right--;
                } 
                else {
                    return sum;
                }
            }
        }

        return closest;
    }
}