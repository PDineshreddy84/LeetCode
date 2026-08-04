class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Set<List<Integer>>res=new HashSet<>();
        Arrays.sort(candidates);
        solve(candidates,res,target,0,new ArrayList<>());
        List<List<Integer>>ans=new ArrayList<>(res);
        return ans;
    }
    public void solve(int candidates[],Set<List<Integer>>res,int target,int i,List<Integer>l){
        if(i==candidates.length){
            if(target==0){
                res.add(new ArrayList<>(l));
            }
            return;
        }
        if(candidates[i]<=target){
            l.add(candidates[i]);
            solve(candidates,res,target-candidates[i],i+1,l);
            l.remove(l.size()-1);
        }
        solve(candidates,res,target,i+1,l);
    }
}