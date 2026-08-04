class Solution {
    public int numOfUnplacedFruits(int[] fruits, int[] baskets) {
        int n1=fruits.length,n2=baskets.length;
        int ans=0;
        for(int i=0;i<n1;i++){
            boolean c=false;
            for(int j=0;j<n2;j++){
                if(fruits[i]<=baskets[j]){
                    baskets[j]=-1;
                    c=true;
                    break;
                }
            }
            if(!c){
                ans++;
            }
        }
        return ans;
    }
}