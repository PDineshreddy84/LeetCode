class Solution {
    public int maxScore(int[] cardPoints, int k) {
        int n=cardPoints.length;
        int lSum=0,rSum=0,m=0,ind=n-1;
        for(int i=0;i<k;i++){
            lSum+=cardPoints[i];
        }
        m=lSum;
        for(int i=k-1;i>-1;i--){
            lSum-=cardPoints[i];
            rSum+=cardPoints[ind];
            ind--;
            m=Math.max(m,lSum+rSum);
        }
        return m;
    }
}