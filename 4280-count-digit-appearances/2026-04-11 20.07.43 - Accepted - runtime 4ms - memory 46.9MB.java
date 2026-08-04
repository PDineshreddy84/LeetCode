class Solution {
    public int countDigitOccurrences(int[] nums, int digit) {
        int c=0;
        for(int num:nums){
            while(num!=0){
                if(num%10==digit){
                    c++;
                }
                num/=10;
            }
        }
        return c;
    }
}