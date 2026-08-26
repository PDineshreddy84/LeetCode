import java.math.*;
class Solution {
    public String shortestBeautifulSubstring(String s, int k) {
        int le=0,r=0,l=0,n=s.length(),c=0,ml=Integer.MAX_VALUE;
        String res="";
        char arr[]=s.toCharArray();
        while(r<n){
            if(arr[r]=='1'){
                c++;
            }
            while(c>k || (l<n && arr[l]=='0')){
                if(arr[l]=='1'){
                    c--;
                }
                l++;
            }
            if(c==k){
                le=r-l+1;
                if(res==""){
                    res=s.substring(l,r+1);
                    ml=le;
                }
                else if(le<ml){
                    ml=le;
                    res=s.substring(l,r+1);
                }
                else if(le==ml){
                    BigInteger org=new BigInteger(res,2);
                    BigInteger curr=new BigInteger(s.substring(l,r+1),2);
                    if(org.compareTo(curr)>0){
                        res=s.substring(l,r+1);
                    }
                }
            }
            r++;
        }
        return res;
    }
}