class Solution {
    public int removeDuplicates(int[] nums) {
        //using slow fast approach 
       
        int k=2;
      int n=nums.length;
       for(int i=2;i<n;i++){
        if(k<2||nums[i]!=nums[k-2]){
            nums[k]=nums[i];
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