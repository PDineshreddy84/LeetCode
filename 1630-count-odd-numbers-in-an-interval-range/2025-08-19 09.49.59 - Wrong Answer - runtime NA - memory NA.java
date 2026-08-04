class Solution {
    public int countOdds(int l, int h) {
        if(h-l==1){
            return 1;
        }
        else if(l%2!=0 && h%2!=0){
            return ((h-l)/2)+1;
        }
        else{
            return (h-l)/2;
        }
    }
}