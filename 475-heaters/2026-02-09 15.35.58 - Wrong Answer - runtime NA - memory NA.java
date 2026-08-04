class Solution {
    public int findRadius(int[] houses, int[] heaters) {
        int l=0,r=0,ans=0;
        for(int h:houses){
            r=Math.max(r,h);
        }
        ans=r;
        Arrays.sort(houses);
        Arrays.sort(heaters);
        while(l<=r){
            int m=l+(r-l)/2;
            if(solve(houses,heaters,m)){
                r=m-1;
                ans=Math.min(ans,m);
            }else{
                l=m+1;
            }
        }
        return ans;
    }
    boolean solve(int []houses,int[]heaters,int m){
        int l=heaters[0]-m,r=heaters[0]+m;
        int j=1;
        for(int i=0;i<houses.length;i++){
            if(houses[i]<l)return false;
            else if(houses[i]>r){
                if(j==heaters.length)return false;
                l=heaters[j]-m;
                r=heaters[j]+m;
                j++;
            }
        }
        return true;
    }

}