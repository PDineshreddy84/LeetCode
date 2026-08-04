class Solution {
    public String maximumOddBinaryNumber(String s) {
        int c=0;
        int n=s.length();
        for(char ch:s.toCharArray()){
            if(ch=='1'){
                c++;
            }
        }
        StringBuilder str=new StringBuilder();
        int r=c-1;
        str.append("1".repeat(r));
        str.append("0".repeat(n-c));
        str.append("1");
        return str.toString();
    }
}