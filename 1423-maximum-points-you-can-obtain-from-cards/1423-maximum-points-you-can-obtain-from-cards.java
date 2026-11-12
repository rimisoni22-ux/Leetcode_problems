class Solution {
    public int maxScore(int[] cardPoints, int k) {
        int leftsum =0;
        int rightsum =0;
        int sum =0;
        int maxsum =0;
        int n = cardPoints.length;
        for(int i=0;i<k;i++){
            leftsum+=cardPoints[i];
           
        }
         maxsum = leftsum;
        int  rightindex = n-1;
        for(int i=k-1;i>=0;i--){
            leftsum -=cardPoints[i];
            rightsum+=cardPoints[rightindex];
            rightindex--;
            maxsum = Math.max(maxsum,leftsum+rightsum);
        }
    return maxsum;

       
    }
}