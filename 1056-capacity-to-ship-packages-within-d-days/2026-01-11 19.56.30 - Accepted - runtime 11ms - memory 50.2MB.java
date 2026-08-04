class Solution {
    public int shipWithinDays(int[] w, int d) {
        int n=w.length;
        int l=0,h=0;
        for(int ele:w){
            l=Math.max(l,ele);
            h+=ele;
        }
        int ans=0;
        while(l<=h){
            int m=l+(h-l)/2;
            if(isPossible(w,m,d)){
                ans=m;
                h=m-1;
            }
            else{
                l=m+1;
            }
        }
        return ans;
    }
    boolean isPossible(int w[],int m,int k){
        int d=1;
        int s=0;
        for(int ele:w){
            if(s+ele>m){
                d++;
                s=ele;
            }
            else{
                s+=ele;
            }
        }
        return d<=k;
    }
}