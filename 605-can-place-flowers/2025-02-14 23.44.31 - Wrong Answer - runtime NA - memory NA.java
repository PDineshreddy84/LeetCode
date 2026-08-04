class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int l=flowerbed.length;
        int k=0;
        int count=0;
    for(int i=0;i<l;i++){
        if(flowerbed[i]==1){
            k=i;
            break;
        }
    }
    for(int i=0;i<l;i++){
         if(flowerbed[i]==1){
           count++;
        }
    }
    if(k%2==0 && (l/2)+1==count+n && l%2!=0){
        return true;
    }
    else if(l%2==0&&k%2==0&&l/2==count+n){
        return true;
    }
    
    else if(k%2!=0 && l/2==count+n){
        return true;
    }
    else return false;
    }
}