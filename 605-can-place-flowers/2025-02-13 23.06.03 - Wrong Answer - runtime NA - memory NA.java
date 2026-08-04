class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int l=flowerbed.length;
        int count=0;
        for(int i=0;i<l;i++){
            if(flowerbed[i]==1){
                count++;
            }
        }
        if((l/2)+1==count+n && l%2==1){
            return true;
        }
       else if((l/2)==count+n && l%2==0){
            return true;
        }
        else
        return false;
    }
}