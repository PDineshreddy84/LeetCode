class Solution {
    public long countSubarrays(int[] nums, long k) {
        int n=nums.length;
        Deque<Integer>maxD=new ArrayDeque<>();
        Deque<Integer>minD=new ArrayDeque<>();
        int l=0;
        long c=0;
        for(int r=0;r<n;r++){
            while(!maxD.isEmpty() && nums[maxD.peekLast()]<=nums[r]){
                maxD.pollLast();
            }
            maxD.addLast(r);
            while(!minD.isEmpty() && nums[minD.peekLast()]>=nums[r]){
                minD.pollLast();
            }
            minD.addLast(r);
            while((long)(nums[maxD.peekFirst()]-nums[minD.peekFirst()])*(r-l+1)>k){
                if(maxD.peekFirst()==l){
                    maxD.pollFirst();
                }
                if(minD.peekFirst()==l){
                    minD.pollFirst();
                    l++;
                }
            }
            c+=(r-l+1);
        }
        return c;
    }
}