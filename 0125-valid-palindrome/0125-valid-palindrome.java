class Solution {
    public boolean isPalindrome(String s){
        // using regex for removing all non-alphanumeric character and convert to lower case
               s = s.replaceAll("[^A-Za-z0-9]", "").toLowerCase();
         int i =0;
         int j =s.length()-1;
         while(i<=j){
            if(s.charAt(i)!=s.charAt(j)){
                return false ;
            }
            i++;
            j--;
         }
         return true;
        




        
    }
}