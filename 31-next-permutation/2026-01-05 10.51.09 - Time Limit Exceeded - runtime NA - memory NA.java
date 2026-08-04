class Solution {
    public void nextPermutation(int[] nums) {
        Set<Integer> vis = new HashSet<>();
        Set<List<Integer>> ans = new HashSet<>();
        List<Integer> curr = new ArrayList<>();
        dfs(nums, curr, ans, vis, 0);
        List<List<Integer>> fin = new ArrayList<>(ans);
        Collections.sort(fin,(l1,l2)->{
            for(int i=0;i<l1.size();i++){
                if(l1.get(i)!=l2.get(i))return l1.get(i)-l2.get(i);
            }
            return 0;
        });
        List<Integer> giv=new ArrayList<>();
        for(int num:nums)giv.add(num);
        for(int i=0;i<fin.size()-1;i++){
            if(fin.get(i).equals(giv)){
               solve(fin.get(i+1),nums);
               return ;
            }
        }
        solve(fin.get(0),nums);
    }
    void solve(List<Integer> l,int[]nums){
        for(int i=0;i<nums.length;i++){
            nums[i]=l.get(i);
        }
    }

    void dfs(int[]nums,List<Integer> curr,Set<List<Integer>> ans,Set<Integer> st,int i){
        if(curr.size()==nums.length){
            ans.add(new ArrayList<>(curr));
            return;
        }
        for(int j=0;j<nums.length;j++){
            if(!st.contains(j)){
                st.add(j);
                curr.add(nums[j]);
                dfs(nums,curr,ans,st,i+1);
                st.remove(j);
                curr.remove(curr.size()-1);
            }
        }
    }
}