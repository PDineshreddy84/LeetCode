class Solution {
    public void rotate(int[] nums, int k) {
        int n=nums.length;
        k%=n;
        reverse(nums,0,n-k-1);
        reverse(nums,n-k,n-1);
        reverse(nums,0,n-1);
    }
    public static int[] reverse(int[] arr,int l,int r){
        int t;
        while(l<r){
            t=arr[l];
            arr[l]=arr[r];
            arr[r]=t;
            l++;
            r--;
        }
        return arr;
    }
}