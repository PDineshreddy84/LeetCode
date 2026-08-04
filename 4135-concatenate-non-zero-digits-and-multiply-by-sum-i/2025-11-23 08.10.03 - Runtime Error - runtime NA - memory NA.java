class Solution {
    public long sumAndMultiply(int n) {
        long sum=0;
        String str=String.valueOf(n);
        StringBuilder sb=new StringBuilder();
        int len=str.length();
        for(int i=0;i<len;i++){
            if(str.charAt(i)!='0'){
                sb.append(str.charAt(i));
            }
            sum+=str.charAt(i)-'0';
        }
        long num=Long.parseLong(sb.toString());
        long res=num*sum;
        return res;
    }
}