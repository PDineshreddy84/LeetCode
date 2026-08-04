class Solution {
    public int firstStableIndex(int[] nums, int k) {
        int n=nums.length;
        int minS=Integer.MAX_VALUE;
        int minI=Integer.MAX_VALUE;
        PriorityQueue<Integer>min=new PriorityQueue<>();
        PriorityQueue<Pair>max=new PriorityQueue<>((a,b)->b.val-a.val);
        for(int ele:nums){
              min.add(ele);
        }
        for(int i=0;i<n;i++){
            max.add(new Pair(nums[i],i));
            int ans=max.peek().val-min.peek();
            min.remove(nums[i]);
            if(ans<minS && ans<=k){
                minS=ans;
                minI=max.peek().ind;
            }
        }
        return minI;
    }
}
class Pair{
    int val,ind;
    Pair(int val,int ind){
        this.val=val;
        this.ind=ind;
    }
}