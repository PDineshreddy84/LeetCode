class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target){
        List<List<Integer>>res=new ArrayList<>();
        Arrays.sort(candidates);
        solve(candidates,res,target,0,new ArrayList<>());
        return res;
    }
    public void solve(int candidates[],List<List<Integer>>res,int target,int ind,List<Integer>l){
        if(target==0){
            res.add(new ArrayList<>(l));
            return;
        }
        for(int i=ind;i<candidates.length;i++){
            if(i>ind && candidates[i]==candidates[i-1])continue;
            if(candidates[i]>target)break;
            l.add(candidates[i]);
            solve(candidates,res,target-candidates[i],i+1,l);
            l.remove(l.size()-1);
        }
    }
}