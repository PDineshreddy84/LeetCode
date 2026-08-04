class Solution {
    public int firstStableIndex(int[] nums, int k) {
        int n=nums.length;
        int minS=Integer.MAX_VALUE;
        int minI=-1;
        PriorityQueue<Integer>min=new PriorityQueue<>();
        PriorityQueue<Integer>max=new PriorityQueue<>((a,b)->b-a);
        for(int ele:nums){
              min.add(ele);
        }
        for(int i=0;i<n;i++){
            max.add(nums[i]);
            int ans=max.peek()-min.peek();
            min.remove(nums[i]);
            if(ans<minS && ans<=k){
                minS=ans;
                minI=i;
            }
        }
        return minI;
    }
}