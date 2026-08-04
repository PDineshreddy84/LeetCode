class Solution {
    public int minimumFlips(int n) {
        String org=Integer.toBinaryString(n);
        StringBuilder sb=new StringBuilder(org);
        String rev=sb.reverse().toString();
        int len=org.length();
        int c=0;
        for(int i=0;i<len;i++){
            if(org.charAt(i)!=rev.charAt(i)){
                c++;
            }
        }
        return c;
    }
}