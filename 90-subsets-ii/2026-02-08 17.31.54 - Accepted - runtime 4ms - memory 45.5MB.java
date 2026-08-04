class Solution {
    int n;
    Set<List<Integer>>s;
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        n=nums.length;
        s=new HashSet<>();
        func(nums,0,new ArrayList<>());
        List<List<Integer>>res=new ArrayList<>(s);
        return res;
    }
    public void func(int nums[],int i,List<Integer>l){
        if(i==n){
            List<Integer>t=new ArrayList<>(l);
            Collections.sort(t);
            s.add(t);
            return;
        }
        l.add(nums[i]);
        func(nums,i+1,l);
        l.remove(l.size()-1);
        func(nums,i+1,l);
    }
}