class Solution {
    public int maxBottlesDrunk(int fb, int x) {
        int e=0;
        int t=0;
       while(fb!=0 || e>=x){
        if(e>=x){
            e=e-x;
            x++;
            fb++;
        }
        else{
            t+=fb;
            e+=fb;
            fb=0;

        }
       }
       return t;
    }
}