class Solution {
    public int maximizeExpressionOfThree(int[] nums) {
        int m1=Integer.MIN_VALUE,m2=Integer.MIN_VALUE,min=Integer.MAX_VALUE;
        for(int num:nums){
            if(m1<=num){
                m2=m1;
                m1=num;
            }
            if(min>num){
                min=num;
            }
            if(m2<=num && num<m1){
                m2=num;
            }
        }
        return m1+m2-min;
    }
}