class Solution {
    public int maxDepth(String s) {
        int n=s.length();
        int c=0,m=0;
        for(int i=0;i<n;i++){
            if(s.charAt(i)=='('){
                c++;
            }
            else if(s.charAt(i)==')'){
                c--;
            }
            m=Math.max(m,c);
        }
        return m;
    }
}