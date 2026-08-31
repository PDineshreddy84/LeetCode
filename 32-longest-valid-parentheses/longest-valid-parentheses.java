class Solution {
    public int longestValidParentheses(String s) {
        int c=0,ml=0;
        Stack<Integer>st=new Stack<>();
        st.push(-1);
        int n=s.length();
        for(int i=0;i<n;i++){
            char ch=s.charAt(i);
            if(ch=='('){
                st.push(i);
            }
            else{
                st.pop();
                if(st.isEmpty()){
                    st.push(i);
                }
                else{
                    ml=Math.max(ml,i-st.peek());
                }
            }
        }
        return ml;
    }
}