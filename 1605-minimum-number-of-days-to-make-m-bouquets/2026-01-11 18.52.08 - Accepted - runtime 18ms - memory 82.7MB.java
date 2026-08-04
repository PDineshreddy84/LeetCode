class Solution {
    public int minDays(int[] bloomDay, int m, int k) {
        int n=bloomDay.length;
        if(n<(long)m*k){
            return -1;
        }
        int max=Integer.MIN_VALUE,min=Integer.MAX_VALUE;
        for(int bloom:bloomDay){
            max=Math.max(bloom,max);
            min=Math.min(bloom,min);
        }
        int l=min,h=max,ans=-1;
        while(l<=h){
            int mid=l+(h-l)/2;
            if(isPossible(bloomDay,mid,m,k)){
                ans=mid;
                h=mid-1;
            }
            else{
                l=mid+1;
            }
        }
        return ans;
    }
    boolean isPossible(int bloomDay[],int day,int m,int k){
        int c=0;
        int b=0;
        for(int bloom:bloomDay){
            if(day>=bloom){
                c++;
                if(c==k){
                    b++;
                    c=0;
                }
            }
            else{
                c=0;
            }
        }
        return b>=m;
    }
}