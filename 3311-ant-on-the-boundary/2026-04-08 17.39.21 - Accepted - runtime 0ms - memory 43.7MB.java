class Solution {
    public int returnToBoundaryCount(int[] nums) {
        int cumsum = 0;
        int boundaryReturns = 0;
        for(int num : nums) {
            cumsum += num;
            if(cumsum == 0) {
                boundaryReturns++;
            }
        }
        return boundaryReturns;
    }
}