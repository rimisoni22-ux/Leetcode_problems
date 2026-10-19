class Solution {
      public int[] productExceptSelf(int[] nums) {
        //prefix suffix approach 
        int n =nums.length;
        int ans[]= new int[n];
         ans[0]=1;
         //prefix
         for(int i=1;i<n;i++){
            ans[i]= ans[i-1]*nums[i-1];

         }
         //suffix
         int suffix=1;
          for(int i=n-1;i>=0;i--){
            ans[i] = ans[i]*suffix;
            suffix *= nums[i];
          }

return ans;








        //    int n = nums.length;
        //    // purane array ke size ka  new array bnao or uame value  put kro new product bali 
        //    int [] ans = new int[n];
        //     for(int i=0;i<nums.length;i++){
        //         int prod=1;
            
        //      for(int j=0;j<n;j++){
        //         // if both are not equal the multiply
        //         if(i!=j){
        //             prod*=nums[j];
        //         }
        //      }
        //      // new ans arr me value puch kar do
        //      ans[i]=prod;
        //     }
        //     // new vali array ko return kra do
        //    return ans;
   
        }
    }
