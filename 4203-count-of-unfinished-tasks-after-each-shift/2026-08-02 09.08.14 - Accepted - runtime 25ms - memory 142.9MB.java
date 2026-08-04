class Solution {
    public int[] countTasks(int[] tasks, int[] shifts) {
        int n1=tasks.length;
        int n2=shifts.length;
        long pref[]=new long[n1];
        long sum=0;
        for(int i=0;i<n1;i++){
            sum+=tasks[i];
            pref[i]=sum;
        }
        int ans[]=new int[n2];
        long temp=0;
        for(int i=0;i<n2;i++){
            temp+=shifts[i];
            int res=bs(pref,temp);
            if(res==0)temp=0;
            ans[i]=res;
        }
        return ans;
    }
    int bs(long pref[],long temp){
        int n=pref.length;
        int l=0,r=n-1;
        int ans=-1;
        while(l<=r){
            int m=l+(r-l)/2;
            if(pref[m]<=temp){
                ans=m;
                l=m+1;
            }
            else{
                r=m-1;
            }
        }
        return n-(ans+1);
    }
}