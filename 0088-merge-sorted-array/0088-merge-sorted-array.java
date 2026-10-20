
class Solution {

    public void swapgreater(int[] nums1, int[] nums2,
                            int idx1, int idx2) {
        if (nums1[idx1] > nums2[idx2]) {
            int temp = nums1[idx1];
            nums1[idx1] = nums2[idx2];
            nums2[idx2] = temp;
        }
    }

    public void merge(int[] nums1, int m, int[] nums2, int n) {

        int len = m + n;
        int gap = (len / 2) + (len % 2);

        while (gap > 0) {
            int left = 0;
            int right = left + gap;

            while (right < len) {

                // Both pointers are in nums1
                if (left < m && right < m) {
                    if (nums1[left] > nums1[right]) {
                        int temp = nums1[left];
                        nums1[left] = nums1[right];
                        nums1[right] = temp;
                    }
                }

                // Left is in nums1, right is in nums2
                else if (left < m && right >= m) {
                    swapgreater(nums1, nums2, left, right - m);
                }

                // Both pointers are in nums2
                else {
                    swapgreater(nums2, nums2, left - m, right - m);
                }

                left++;
                right++;
            }

            if (gap == 1) {
                break;
            }

            gap = (gap / 2) + (gap % 2);
        }

        // Copy nums2 into the empty positions of nums1
        for (int i = 0; i < n; i++) {
            nums1[m + i] = nums2[i];
        }
    }
}
     //BRUETE FORCE  
      //tc=0(m+n)+0(m+n)
      //sc=0(m+n)   
//            int[] nums3 = new int[m + n];
//          int  left=0;
//          int right =0;
//          int  idx =0;
//           while( left<m && right<n){
//             if(nums1[left]<=nums2[right]){
//                 nums3[idx]= nums1[left];
//                 left++;
//                 idx++;

//             } else{
//                 nums3[idx]= nums2[right]
//                 right++;
//                 idx++;
//             }
//           }
//            while(left<m){
//             nums3[idx++]= nums1[left++];
//            }
//               while(right<n){
//             nums3[idx++]= nums2[right++];

//            }
//             for(int i=0;i<n+m;i++){          
//                  nums1[i]= nums3[i];
//             }
           
//     }
// }

//optimal approach
//         int left = m - 1;
//         int right = 0;

//         // Step 1: Swap elements in wrong order
//         while (left >= 0 && right < n) {
//             if (nums1[left] > nums2[right]) {
//                 int temp = nums1[left];
//                 nums1[left] = nums2[right];
//                 nums2[right] = temp;

//                 left--;
//                 right++;
//             } else {
//                 break;
//             }
//         }

//         // Step 2: Sort valid elements of both arrays
//         Arrays.sort(nums1, 0, m);
//         Arrays.sort(nums2);

//         // Step 3: Copy nums2 into nums1's empty positions
//         for (int i = 0; i < n; i++) {
//             nums1[m + i] = nums2[i];
//         }

//         // Step 4: Sort the complete nums1 array
//         Arrays.sort(nums1);
//     }
// }



            
    //     int i = m-1;
    //     int j = n-1;
    //     int k = m + n-1;
    //     while(i>=0 &&j>=0){
    //         if(nums1[i]>nums2[j]){
    //             nums1[k]=nums1[i];
    //             i--;
    //         }else {
    //             nums1[k]=nums2[j];
    //             j--;
    //         }
    //         k--;
    //     }
    //     while(j>=0){
    //         nums1[k]= nums2[j];
    //         j--;
    //         k--;
    //     }
    // }

