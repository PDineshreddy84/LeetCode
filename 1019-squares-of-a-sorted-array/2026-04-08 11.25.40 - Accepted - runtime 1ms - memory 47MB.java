class Solution {
    public int[] sortedSquares(int[] nums) {
        int n= nums.length;
        int left=0,right=n-1;
        int vleft,vright;
        int x=n-1;
        int arr[]=new int[n];
        while(left<=right)
        {
            vleft=nums[left]*nums[left];
            vright=nums[right]*nums[right];
            if(vleft>vright)
            {
                arr[x]=vleft;
                left++;
            }
            else
            {
                arr[x]=vright;
                right--;
            }
            x--;
        }
        return arr;
    }
}