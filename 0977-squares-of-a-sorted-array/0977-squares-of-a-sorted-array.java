
class Solution {
    public int[] sortedSquares(int[] nums) {
      int n = nums.length;
      int ans [] = new int[n];
      int left =0;
      int right = nums.length-1;
       int  i = nums.length-1;
       while(left<=right){
        int ls = nums[left]*nums[left];
        int rs = nums[right]*nums[right];
        if(ls>rs){
            ans[i] = ls;
            left++;
        }
        else{
            ans[i]=rs;
            right--;
        }
        i--;
       }
       return ans;
    }
}
