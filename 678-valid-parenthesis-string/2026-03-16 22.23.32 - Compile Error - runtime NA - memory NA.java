class Solution {
    public boolean checkValidString(String s) {
        int cmin = 0, cmax = 0;
        for (char c : s.toCharArray()) {
            if (c == '(') {
                cmax++;
                cmin++;
            } else if (c == ')') {
                cmax--;
                cmin--;
            } else{
                cmax++;
                cmin--;
            }
            if(cmin<0)min=0;
            if (cmax < 0) return false; 
        }
        return cmin == 0;
    }
}