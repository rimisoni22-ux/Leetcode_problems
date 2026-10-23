class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
         for(int i=0;i<nums.length;i++){
            if(!map.containsKey(nums[i])){
                map.put(nums[i],map.get((nums[i])+1));                
            }
            else{
              return true;
            }
         }
         return false;
    }
}













        // Arrays.sort(nums);
        // int n = nums.length;
        // for(int i =1;i<n;i++){
        //     if (nums[i] == nums [i-1])
        //         return true;
            
        // }
        // return false ;
        
//     }
// }
