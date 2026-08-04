class Solution {
    int n;
    List<List<Integer>>res;
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        n=nums.length;
       res=new ArrayList<>();
        Arrays.sort(nums);
        func(nums,0,new ArrayList<>());
        return res;
    }
    public void func(int nums[],int ind,List<Integer>l){
        res.add(new ArrayList<>(l));
        for(int i=ind;i<n;i++){
            if(i>ind && (nums[i]==nums[i-1]))continue;
            l.add(nums[i]);
            func(nums,i+1,l);
            l.remove(l.size()-1);
        }
    }
}