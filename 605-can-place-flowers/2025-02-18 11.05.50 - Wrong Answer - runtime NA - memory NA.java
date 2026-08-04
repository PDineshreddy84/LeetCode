class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int l=flowerbed.length;
        int key=0,count=0;
        for(int i=0;i<flowerbed.length;i++){
            if(flowerbed[i]==1){
                key=i;
                break;
            }
        }
        for(int i=0;i<flowerbed.length;i++){
            if(flowerbed[i]==1){
              count++;
            }
        }
        if(key%2==0&&count+n<=(l+1)/2){
            return true;
        }
        else if(key%2!=0&&count+n<=l/2){
            return true;
        }
        else return false;
    }
}