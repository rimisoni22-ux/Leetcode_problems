class Solution {
    public int addMinimum(String word) {
          int i =0;
          int count =0;
          int n = word.length();
           while(i<n){ 

            // check for a 
            if(i<n &&  word.charAt(i)=='a')
            { 
                 i++;        

            } else {
                count++; // agr a nahi  hai tab
            } 
            // check for b 
             if(i<n && word. charAt(i)=='b')
            { 
                 i++;        

            } else { // agr b nahi hai tab
                count++;
            }
             if(i<n && word. charAt(i)=='c')
            { 
                 i++;        

            } else { // agr b nahi hai tab
                count++;
            }


           }
            return count;
         
        
    }
}