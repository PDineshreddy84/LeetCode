class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int len=flowerbed.length;
        int c=0;
        if(len==1 && flowerbed[0]==0)return true;
        if(flowerbed[0]==0 && len>1 && flowerbed[1]==0){
            flowerbed[0]=1;
            c++;
        }  
        if(flowerbed[len-1]==0 && len>1 && flowerbed[len-2]==0){
            flowerbed[len-1]=1;
            c++;
        }
        for(int i=0;i<len;i++){
            if(flowerbed[i]==0){
                if((i>0 && flowerbed[i-1]!=1 )&& (i<len-1 && flowerbed[i+1]!=1)){
                    flowerbed[i]=1;
                    c++;
                }
            }
        }
        return n<=c;
    }
}