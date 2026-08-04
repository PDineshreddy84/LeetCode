class Solution {
    List<List<Integer>>ans;
    int n;
    public List<List<Integer>> subsets(int[] nums) {
        List<Integer>l=new ArrayList<>();
        n=nums.length;
        ans=new ArrayList<>();
        subsets(nums,l,0);
        return ans;
    }
    public void subsets(int nums[],List<Integer>l,int ind){
        if(ind==n){
                ans.add(new ArrayList<>(l));
            return;
        }
        l.add(nums[ind]);
        subsets(nums,l,ind+1);
        l.remove(l.size()-1);
        subsets(nums,l,ind+1);
    }
}