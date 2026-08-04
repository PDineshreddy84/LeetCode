class Solution {
    public boolean checkString(String s) {
        int n=s.length();
        int req=-1;
        for(int i=0;i<n;i++){
            if(s.charAt(i)=='b'){
                req=i+1;
                break;
            }
        }
        if(req==-1){
            return true;
        }
        for(int i=req;i<n;i++){
            if(s.charAt(i)=='a'){
                return false;
            }
        }
        return true;
    }
}