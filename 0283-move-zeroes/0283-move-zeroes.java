class Solution {
    public void moveZeroes(int[] nums) {
        int k =0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=0){
                int temp = nums[i];
                nums[i]=nums[k];
                nums[k]=temp;
                k++;
            }
        }
       
    }
}



























//         int i = 0; // pointer for the next non-zero position
        
//         for (int j = 0; j < nums.length; j++) {
//             if (nums[j] != 0) {
//                 // Swap nums[i] and nums[j]
//                 int temp = nums[i];
//                 nums[i] = nums[j];
//                 nums[j] = temp;
//                 i++;
//             }
//         }
//     }
// }
// class Solution {
//     void pushZerosToEnd(int[] arr, int n) {
//         int count = 0; // position for next non-zero element
        
//         // Traverse the array
//         for (int i = 0; i < n; i++) {
//             if (arr[i] != 0) {
//                 // Move non-zero element to 'count' index
//                 int temp = arr[count];
//                 arr[count] = arr[i];
//                 arr[i] = temp;
//                 count++;
//             }
//         }
//     }
// }

// 2 pointers approach
// int size = nums.length;
// if(size==0||size==1){
//     return;
// }
// int nz = 0,z=0;
// while(nz<size){
//     if(nums[nz]!=0){
//         int temp = nums[nz];
//         nums[nz] = nums[z];
//         nums[z] = temp;
//         nz++;
//         z++;
//     }
//     else {
//         nz++;
//     }
// }
//     }
// }

