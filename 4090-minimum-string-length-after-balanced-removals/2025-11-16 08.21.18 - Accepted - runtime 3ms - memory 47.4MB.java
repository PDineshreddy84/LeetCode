class Solution {
    public int minLengthAfterRemovals(String s) {
        int c1=0,c2=0;
        for(char ch:s.toCharArray()){
            if(ch=='a'){
                c1++;
            }
            if(ch=='b'){
                c2++;
            }
        }
        return Math.abs(c1-c2);
    }
}