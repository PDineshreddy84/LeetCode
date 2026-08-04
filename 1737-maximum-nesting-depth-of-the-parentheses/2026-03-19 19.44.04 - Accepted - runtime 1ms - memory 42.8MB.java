class Solution {
    public int maxDepth(String s) {
        int n=s.length();
        int c=0,m=0;
        Stack<Character>st=new Stack<>();
        for(int i=0;i<n;i++){
            if(s.charAt(i)=='('){
                st.push('(');
                c++;
            }
            else if(s.charAt(i)==')'){
                st.pop();
                c--;
            }
            if(st.isEmpty()){
                c=0;
            }
            m=Math.max(m,c);
        }
        return m;
    }
}