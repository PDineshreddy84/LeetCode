class Solution {
    public boolean canMakeSubsequence(String s, String t) {
        int m=s.length(),n=t.length();
        if(m>n)return false;
        int i=0,j=0,r=0;
        while(i<m && j<n){
            if(s.charAt(i)==t.charAt(j)){
                i++;
                j++;
            }
            else if(r==0){
                r++;
                i++;
                j++;
            }
            else{
                j++;
            }
        }
        return i==m;
    }
}