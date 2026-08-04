class Solution {
    public boolean isPathCrossing(String path) {
        int h=0,v=0;
        for(char ch:path.toCharArray()){
            if(ch=='N'){
                h++;
            }
            else if(ch=='S'){
                h--;
            }
            else if(ch=='E'){
                v++;
            }
            else if(ch=='W'){
                v--;
            }
            if(v==0 && h==0)return true;
        }
        return false;
    }
}