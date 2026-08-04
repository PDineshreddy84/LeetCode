class Solution {
    public boolean checkValidString(String s) {
        int min=0,max=0;
        for(char ch:s.toCharArray()){
            if(ch=='('){
                min--;
            }
            else if(ch==')'){
                max++;
            }
            else{
                min--;
                max++;
            }
            if(min<0)min=0;
            if(max<0)return false;
        }
        return min==0;
    }
}