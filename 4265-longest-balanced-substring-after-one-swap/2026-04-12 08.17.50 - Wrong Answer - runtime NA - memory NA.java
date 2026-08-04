class Solution {
    public int longestBalanced(String s) {
        int z=0,o=0;
        for(char ch:s.toCharArray()){
            if(ch=='0'){
                z++;
            }
            else{
                o++;
            }
        }
        return 2*Math.min(z,o);
    }
}