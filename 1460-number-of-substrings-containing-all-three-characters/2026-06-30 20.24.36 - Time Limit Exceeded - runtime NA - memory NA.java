class Solution {
    public int numberOfSubstrings(String s) {
        int n=s.length();
        int c=0;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(s.substring(i,j+1).contains("a")&&s.substring(i,j+1).contains("b")&&s.substring(i,j+1).contains("c")){
                    c++;
                }
            }
        }
        return c;
    }
}