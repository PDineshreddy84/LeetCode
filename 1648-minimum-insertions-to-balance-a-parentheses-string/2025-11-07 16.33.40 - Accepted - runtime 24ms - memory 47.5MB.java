class Solution {
    public int minInsertions(String s) {
        Stack<Character>st=new Stack<>();
        char ch[]=s.toCharArray();
        int n=ch.length,c=0;
        for(int i=0;i<n;i++){
            if(ch[i]=='('){
                st.push(ch[i]);
            }
            else{
                if(i<n-1 && ch[i+1]==')'){
                    i++;
                }
                else{
                    c++;
                }
                if(!st.isEmpty()){
                    st.pop();
                }
                else{
                    c++;
                }
            }
        }
        c+=2*st.size();
        return c;
    }
}