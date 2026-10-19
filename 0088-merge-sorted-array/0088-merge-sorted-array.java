class Solution {
    public void merge (int [] nums1 ,int m,int [] nums2,int n){
      //BRUETE FORCE
           int[] nums3 = new int[m + n];
         int  left=0;
         int right =0;
         int  idx =0;
          while( left<m && right<n){
            if(nums1[left]<=nums2[right]){
                nums3[idx]= nums1[left];
                left++;
                idx++;

            } else{
                nums3[idx]= nums2[right];
                right++;
                idx++;
            }
          }
           while(left<m){
            nums3[idx++]= nums1[left++];
           }
              while(right<n){
            nums3[idx++]= nums2[right++];

           }
            for(int i=0;i<n+m;i++){
           
                 nums1[i]= nums3[i];
            }
           
    }
}
            
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

