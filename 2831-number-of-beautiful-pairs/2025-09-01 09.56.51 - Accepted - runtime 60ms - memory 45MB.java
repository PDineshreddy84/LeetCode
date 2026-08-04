class Solution {
    public int countBeautifulPairs(int[] nums) {
        int n=nums.length,c=0;
        for(int i=0;i<n-1;i++){
            for(int j=i+1;j<n;j++){
                int x=Integer.parseInt((nums[i]+"").charAt(0)+"");
                if(gcd(x,nums[j]%10)==1){
                    c++;
                }
            }
        }
        return c;
    }
    public int gcd(int p,int q){
        if(q==0){
            return p;
        }
        return gcd(q,p%q);
    }
}