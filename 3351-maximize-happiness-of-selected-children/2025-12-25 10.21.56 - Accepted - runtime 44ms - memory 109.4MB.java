class Solution {
    public long maximumHappinessSum(int[] happiness, int k) {
        long res=0l;
        int n=happiness.length;
        Arrays.sort(happiness);
        int j=0;
        for(int i=n-1;i>=0;i--){
            if(k<1){
                break;
            }
            else{
                if(happiness[i]-j>0){
                    res+=happiness[i]-j;
                    j++;
                }
                else{
                    break;
                }
            }
            k--;
        }
        return res;
    }
}