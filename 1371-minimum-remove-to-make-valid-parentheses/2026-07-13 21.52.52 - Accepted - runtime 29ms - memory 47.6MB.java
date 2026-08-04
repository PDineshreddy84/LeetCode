class Solution {
    public String minRemoveToMakeValid(String s) {
     Set<Integer>set=new HashSet<>();
     Stack<Integer>st=new Stack<>();
     int n=s.length();
     for(int i=0;i<n;i++){
        if(s.charAt(i)=='('){
            st.push(i);
        }
        else if(s.charAt(i)==')'){
            if(st.isEmpty()){
                set.add(i);
            }
            else{
                st.pop();
            }
        }
     }
     while(!st.isEmpty()){
        set.add(st.pop());
     }
     StringBuilder sb=new StringBuilder();
     for(int i=0;i<n;i++){
        if(!set.contains(i)){
            sb.append(s.charAt(i)+"");
        }
     }
     return sb.toString();
    }
}