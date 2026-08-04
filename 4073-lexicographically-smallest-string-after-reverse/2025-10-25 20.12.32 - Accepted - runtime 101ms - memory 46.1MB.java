class Solution {
    public String lexSmallest(String s) {
        String ans=s;
        int n=s.length();
        for(int k=1;k<=n;k++){
            String firstK=new StringBuilder(s.substring(0,k)).reverse().toString()+s.substring(k);
            String
            lastK=s.substring(0,n-k)+new StringBuilder(s.substring(n-k)).reverse().toString();
            if(firstK.compareTo(ans)<0){
                ans=firstK;
            }
            if(lastK.compareTo(ans)<0){
                ans=lastK;
            }
        }
        return ans;
    }
}