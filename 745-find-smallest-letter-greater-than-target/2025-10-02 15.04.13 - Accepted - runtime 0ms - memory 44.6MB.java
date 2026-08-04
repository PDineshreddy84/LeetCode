class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        int n=letters.length;
        int l=0,r=n-1;
        while(l<=r){
            int m=l+(r-l)/2;
            if(target<letters[m]){
                r=m-1;
            }
            else{
                l=m+1;
            }
        }
        return letters[l%n];
    }
}