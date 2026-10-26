class Solution {
    public int removeDuplicates(int[] nums) {
        int k =0;
        for(int num:nums){
            if(k<2){
                nums[k]=num;
                k++;
            }
            else if(num!=nums[k-2]){
                nums[k]=num;
                k++;

            }
        }
        return k;


    
    }
    
}






































//method 2 
// class Solution {
//     public int removeDuplicates(int[] nums) {
//         int n = nums.length;
        
//         if (n <= 2) return n;

//         int i = 2;

//         for (int j = 2; j < n; j++) {
//             if (nums[j] != nums[i - 2]) {
//                 nums[i] = nums[j];
//                 i++;
//             }
//         }

//         return i;
//     }
// }