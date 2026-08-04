class Solution {
    public int kItemsWithMaximumSum(int numOnes, int numZeros, int numNegOnes, int k) {
        int sum=0;
        if(k<numOnes){
            return k;
        }
       if(numOnes<=k){
            sum=numOnes;
            k-=numOnes;
       }
        if(k>0){
            k-=numZeros;
        }
        if(k<=0){
            return sum;
        }
        if(k<=numNegOnes){
            sum-=k;
            return sum;
        }
        return sum;
    }
}