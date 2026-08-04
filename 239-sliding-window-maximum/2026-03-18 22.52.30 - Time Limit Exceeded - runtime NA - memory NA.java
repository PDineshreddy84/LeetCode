class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        PriorityQueue<Integer>pq=new PriorityQueue<>((a,b)->b-a);
        int n=nums.length;
        int ans[]=new int[n-k+1];
        for(int i=0;i<k-1;i++){
            pq.add(nums[i]);
        }
        for(int i=k-1;i<n;i++){
            pq.add(nums[i]);
            ans[i-k+1]=pq.peek();
            pq.remove(nums[i-k+1]);
        }
        return ans;
    }
}