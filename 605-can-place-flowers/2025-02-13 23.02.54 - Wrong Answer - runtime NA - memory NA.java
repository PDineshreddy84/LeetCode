class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int l=flowerbed.length;
        int count=0;
        for(int i=0;i<l;i++){
            if(flowerbed[i]==1){
                count++;
            }
        }
        if((l/2)+1==count+n){
            return true;
        }
        else
        return false;
    }
}