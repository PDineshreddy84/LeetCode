class Solution {
    public int numWaterBottles(int nb, int ne) {
        int res=nb;
        while(nb>=ne){
            int rem=nb%ne;
            res+=nb/ne;
            nb=rem+(nb/ne);
        }
        return res;
    }
}