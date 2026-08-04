class Solution {
    public int maxIceCream(int[] costs, int coins) {
        Arrays.sort(costs);
        int n=costs.length;
        int c=0;
        for(int i=0;i<n;i++){
            if(costs[i]<=coins){
                coins-=costs[i];
                c++;
            }
            else{
                break;
            }
        }
        return c;
    }
}