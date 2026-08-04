class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int l=1,r=max(piles);
        int ans=r;
        while(l<=r){
            int m=l+(r-l)/2;
            int th=calc(piles,m,h);
            if(th<=h){
                ans=m;
                r=m-1;
            }
            else{
                l=m+1;
            }
        }
        return ans;
    }
    int max(int piles[]){
        int m=0,n=piles.length;
        for(int i=0;i<n;i++){
            if(m<piles[i]){
                m=piles[i];
            }
        }
        return m;
    }
    int calc(int piles[],int m,int h){
        int n=piles.length;
        int th=0;
        for(int i=0;i<n;i++){
            th+=(int)(Math.ceil((double)piles[i]/(double)m));
            if(th>h){
                return th;
            }
        }
        return th;
    }
}