class Solution {
    public long perfectPairs(int[] nums) {
        int n=nums.length;
        long c=0;
        int j=0;
        long arr[]=new long[n];
        for(int i=0;i<n;i++){
            arr[i]=Math.abs(nums[i]);
        }
        Arrays.sort(arr);
        for(int i=0;i<n;i++){
            while(j<n && arr[j]<=2*arr[i]){
                j++;
            }
            c+=j-i-1;
        }
        
        return c;
    }
}