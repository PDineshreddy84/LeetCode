class Solution {
    public int numberOfSubstrings(String s) {
        int n=s.length(),a=-1,b=-1,c=-1;
        int ans=0;
        for(int i=0;i<n;i++){
           if(s.charAt(i)=='a'){
            a=i;
           }
           else if(s.charAt(i)=='b'){
            b=i;
           }
           else{
            c=i;
           }
            ans+=1+Math.min(a,Math.min(b,c));
        }
        return ans;
    }
}