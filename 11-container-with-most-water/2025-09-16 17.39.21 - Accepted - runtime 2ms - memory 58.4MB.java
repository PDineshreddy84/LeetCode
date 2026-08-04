class Solution {
    public int maxArea(int[] height) {
        int n=height.length;
        int left=0,right=n-1,maxArea=0,current=Integer.MAX_VALUE;
        while(left<right){
            current=Math.min(height[left],height[right]);
            maxArea=Math.max(maxArea,(right-left)*current);
           while(left<right && height[left]<=current){
            left++;
           }
           while(left<right && height[right]<=current){
            right--;
           }
        }
        return maxArea;
    }
}