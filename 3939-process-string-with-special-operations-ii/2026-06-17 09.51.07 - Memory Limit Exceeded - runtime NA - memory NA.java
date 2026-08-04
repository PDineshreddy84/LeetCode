class Solution {
    public char processStr(String s, long k) {
        StringBuilder sb=new StringBuilder();
        int n=s.length();
        for(int i=0;i<n;i++){
            char ch=s.charAt(i);
            if(ch=='*'){
                if(sb.length()>0){
                    sb.deleteCharAt(sb.length()-1);
                }
            }
            else if(ch=='#'){
                sb.append(sb);
            }
            else if(ch=='%'){
                sb.reverse();
            }
            else{
                sb.append(ch);
            }
        }
        return k<sb.length()?sb.charAt((int)k):'.';
    }
}