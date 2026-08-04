class Solution {
    public String addStrings(String num1, String num2) {
        StringBuilder sb=new StringBuilder();
        int n1=num1.length(),n2=num2.length(),c=0;
        int i=n1-1,j=n2-1;
        while(i>=0 || j>=0 || c!=0){
            int sum=c;
            if(i>=0){
                sum+=num1.charAt(i)-'0';
                i--;
            }
            if(j>=0){
                sum+=num2.charAt(j)-'0';
                j--;
            }
            sb.append(sum%10);
            c=sum/10;
        }
        return sb.reverse().toString();
    }
}