class Solution {
    public long sumAndMultiply(int n) {
        long sum=0;
        String str=String.valueOf(n);
        StringBuilder sb=new StringBuilder();
        int len=str.length();
        for(int i=0;i<len;i++){
            char ch=str.charAt(i);
           if(ch!='0'){
               sb.append(ch);
               sum+=ch-'0';
           }
        }
        long num;
        if(sb.length()==0){
            num=0l;
        }
        else{
            num=Long.parseLong(sb.toString());
        }
        return num*sum;
    }
}