class Solution {
    public int addedInteger(int[] nums1, int[] nums2) {
        int sum1 = sum(nums1);
        int sum2 = sum(nums2);
        return (sum2-sum1)/nums1.length;
    }

    public int sum(int arr[]){
        int sum = 0;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
        }
        return sum;
    }
}