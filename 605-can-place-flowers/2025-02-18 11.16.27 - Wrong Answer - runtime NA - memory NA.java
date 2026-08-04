class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int l=flowerbed.length;
        int key1=0,count=0,key2=0;
        for(int i=0;i<flowerbed.length;i++){
            if(flowerbed[i]==1){
                key1=i;
                break;
            }
        }
        for(int i=l-1;i>=0;i--){
            if(flowerbed[i]==1 && i%2!=key1%2){
                key2=i;
                break;
            }
        }
        for(int i=0;i<flowerbed.length;i++){
            if(flowerbed[i]==1){
              count++;
            }
        }
        if(count+n<l/2){
            return true;
        }
        if(key1%2==0&&count+n<=(l+1)/2 && key2==0){
            return true;
        }
        else if(key1%2!=0&&count+n<=l/2 && key2==0){
            return true;
        }
        else return false;
    }
}