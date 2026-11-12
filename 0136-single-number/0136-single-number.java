// class Solution {
//     public int singleNumber(int[] nums) {

//         int n = nums.length;
//         int start = 0;
//         int end = n - 1;
//         while (start < end) {

//             int mid = start + (end - start) / 2;
//             if (mid == 0 && nums[0] != nums[1])
//                 return nums[mid];
//             if (mid == n - 1 && nums[n - 1] != nums[n - 2])
//                 return nums[mid];
//             // if (nums[mid - 1] != nums[mid]  && nums[mid]!= nums[mid + 1])
//             //     return nums[mid];   
//             if (mid > 0 && mid < n - 1 &&
//                     nums[mid - 1] != nums[mid] &&
//                     nums[mid] != nums[mid + 1])
//                 return nums[mid];

//             if (mid % 2 == 0) { // even
//                 if (nums[mid] == nums[mid - 1]) { //left move
//                     end = mid - 1;
//                 } else { //right move
//                     start = mid + 1;
//                 }

//             } else { // odd
//                 if (nums[mid] == nums[mid - 1]) { //right move 
//                     start = mid + 1;
//                 } else { /// left move
//                     end = mid - 1;
//                 }
//             }

//         }
//         return nums[start];
//     }
// }
// //    int n = nums.length;

// //    for(int i=0;i<n;i++){
// //     int count=0;
// //     for(int j=0;j<n;j++){
// //          if(nums[i]==nums[j]){
// //             count++;
// //          }
// //     }
// //     if(count==1){
// //         return nums[i];
// //     }
// //    }
// //    return -1;

// //     }
// // }

class Solution {
     public int singleNumber(int[] nums) {
        int k = 0 ; 
        for(int i = 0 ; i < nums.length; i++){
            k = k ^ nums[i] ;

        }

        return k ;


     }
}