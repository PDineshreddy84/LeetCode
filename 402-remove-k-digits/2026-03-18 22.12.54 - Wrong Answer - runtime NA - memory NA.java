class Solution {
    public String removeKdigits(String num, int k) {
        int n=num.length();
        Stack<Character>st=new Stack<>();
        for(int i=0;i<n;i++){
            while(!st.isEmpty() && k>0 && (st.peek()-'0')>num.charAt(i)-'0'){
                st.pop();
                k--;
            }
            st.push(num.charAt(i));
        }
        while(k>0){
            st.pop();
            k--;
        }
        if(st.isEmpty())return "0";
        String res="";
        int f=0;
        for(char ch:st){
            if(ch!='0'){
                f=1;
            }
            if(f==0){
                continue;
            }
            res+=ch;
        }
        return res;
    }
}