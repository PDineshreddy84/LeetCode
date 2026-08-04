class Solution {
    public int maxContainers(int n, int w, int maxWeight) {
        int ans=0;
        for(int i=1;i<=n*n;i++){
            ans=i-1;
            if(i*w>maxWeight){
                break;
            }
        }
        return ans;
    }
}