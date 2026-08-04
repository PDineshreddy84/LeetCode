class Solution {
    public String convert(String s, int numRows) {
        if(numRows==1)return s;
        StringBuilder ans=new StringBuilder();
        int n=s.length();
        int charInSec=2*(numRows-1);
        for(int currRow=0;currRow<numRows;currRow++){
            int ind=currRow;
            while(ind<n){
                ans.append(s.charAt(ind));
                if(currRow!=0 && currRow!=numRows-1){
                    int charInBetween=charInSec-(2*(currRow));
                    int secInd=ind+charInBetween;
                    if(secInd<n){
                        ans.append(s.charAt(secInd));
                    }
                }
                ind+=charInSec;
            }
        }
        return ans.toString();
    }
}
