class Solution {
    public int findContentChildren(int[] g, int[] s) {
        int c=0;
        for(int i=0;i<g.length;i++){
            for(int j=0;j<s.length;j++){
                if(s[j]>=g[i]){
                    c++;
                    break;
                }
            }
        }
        return c;
    }
}