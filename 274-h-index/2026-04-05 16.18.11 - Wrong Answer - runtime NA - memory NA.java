class Solution {
    public int hIndex(int[] citations) {
        int n=citations.length;
        int l=0,r=1000,ans=0;
        while(l<r){
            int m=r+(l-r)/2;
            if(solve(citations,n,m)){
                ans=m;
                l=m+1;
            }
            else{
                r=m-1;
            }
        }
        return ans;
    }
    boolean solve(int citations[],int n,int m){
        int c=0;
        for(int i=0;i<n;i++){
            if(citations[i]>=m){
                c++;
            }
        }
        return c>=m;
    }
}