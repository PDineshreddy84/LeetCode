class Solution {
    public int minStoneSum(int[] piles, int k) {
        int n=piles.length-1;
       while(k-->0){
        Arrays.sort(piles);
            if(piles[n]%2==1)
          piles[n]=((piles[n])/2)+1;
            else
          piles[n]=(piles[n])/2;
       }
        int sum=0;
        for(int i=0;i<n+1;i++){
            sum=sum+piles[i];
        }
        return sum;
    }
}