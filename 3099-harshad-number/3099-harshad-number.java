class Solution {
    public int sumOfTheDigitsOfHarshadNumber(int x) {
        int sum =0;

          for(int i=x;i!=0;i/=10){
             
               int  ld= i%10;
                 sum+=ld;
          }
           if(x%sum==0){
            return sum;
           }
            
      return -1;  
    }
}