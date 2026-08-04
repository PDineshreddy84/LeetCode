class Solution {
    public String reverseParentheses(String s) {
        Stack<Character>st=new Stack<>();
        StringBuilder sb=new StringBuilder();
        for(char ch:s.toCharArray()){
            if(ch==')'){
                sb=new StringBuilder();
                while(true){
                    char c=st.pop();
                    if(c=='('){
                        break;
                    }
                    sb.append(c);
                }
                for(int i=0;i<sb.length();i++){
                    st.push(sb.charAt(i));
                }
            }
            else{
             st.push(ch);
            }
        }
        sb=new StringBuilder();
        while(!st.isEmpty()){
            sb.append(st.pop());
        }
        return sb.reverse().toString();
    }
}