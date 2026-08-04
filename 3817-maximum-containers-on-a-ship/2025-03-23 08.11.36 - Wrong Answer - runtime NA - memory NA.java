class Solution {
    public int maxContainers(int n, int w, int maxWeight) {
        int ans=0;
        for(int i=n;i<maxWeight/2;i++){
            ans=i-1;
            if(i*w>maxWeight){
                break;
            }
        }
        return ans;
    }
}