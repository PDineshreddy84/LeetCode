class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>>res=new ArrayList<>();
        solve(candidates,target,res,new ArrayList<>(),0);
        return res;
    }
    public void solve(int candidates[],int target,List<List<Integer>>res,List<Integer>l,int i){
        if(i==candidates.length){
            if(target==0){
                res.add(new ArrayList<>(l));
            }
            return;
        }
        if(candidates[i]<=target){
            l.add(candidates[i]);
            solve(candidates,target-candidates[i],res,l,i);
            l.remove(l.size()-1);
        }
        solve(candidates,target,res,l,i+1);
    }
}