class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer>st=new Stack<>();
        String op="+-*/";
        int n=tokens.length;
        int ans=0;
        for(int i=0;i<n;i++){
            if(op.contains(tokens[i])){
                int t1=st.pop();
                int t2=st.pop();
                if(tokens[i].equals("+")){
                    st.push(t1+t2);
                }
                else if(tokens[i].equals("*")){
                    st.push(t1*t2);
                }
                else if(tokens[i].equals("-")){
                    st.push(t2-t1);
                }
                else{
                    st.push(t2/t1);
                }
            }
            else{
                st.push(Integer.parseInt(tokens[i]));
            }
        }
        return st.peek();
    }
}