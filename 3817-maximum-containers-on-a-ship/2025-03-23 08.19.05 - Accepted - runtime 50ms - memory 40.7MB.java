class Solution {
    public int maxContainers(int n, int w, int maxWeight) {
        int ans=n*n;
        for(int i=1;i<=n*n;i++){
            if(i*w>maxWeight){
                ans=i-1;
                break;
            }
        }
        return ans;
    }
}