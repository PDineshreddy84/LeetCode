class Solution {
    public int minInsertions(String s) {
        Stack<Character>st=new Stack<>();
        char ch[]=s.toCharArray();
        int n=ch.length;
        for(int i=0;i<n-1;i++){
           if(ch[i]==')' && ch[i+1]==')'){
            if(!st.isEmpty() && st.peek()=='('){
                i++;
                st.pop();
            }
            else{
                st.push(ch[i]);
                st.push(ch[i+1]);
            }
           }
           else{
            st.push(ch[i]);
           }
        }
        return st.size();
    }
}