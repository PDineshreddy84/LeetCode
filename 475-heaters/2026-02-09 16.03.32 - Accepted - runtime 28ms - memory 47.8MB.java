class Solution {
    public int findRadius(int[] houses, int[] heaters) {
        int l=0,r=0,ans=Integer.MAX_VALUE;
        for(int h:houses){
            r=Math.max(r,h);
        }
        r=(int)(1e9);
        Arrays.sort(houses);
        Arrays.sort(heaters);
        while(l<=r){
            int m=l+(r-l)/2;
            if(solve(houses,heaters,m)){
            System.out.println(m);
                ans=Math.min(ans,m);
                r=m-1;
            }else{
                l=m+1;
            }
        }
        System.out.println(solve(houses,heaters,6));
        return ans;
    }
    boolean solve(int []houses,int[]heaters,int m){
        long l=heaters[0]-(long)m,r=heaters[0]+(long)m;
        int j=0,i=0;
        while(i<houses.length){
            if(houses[i]<l)return false;
            if(houses[i]>r){
                j++;
                if(j>=heaters.length)return false;
                l=(long)heaters[j]-(long)m;
                r=(long)heaters[j]+(long)m;
            }
            else i++;
        }
        return true;
    }
}