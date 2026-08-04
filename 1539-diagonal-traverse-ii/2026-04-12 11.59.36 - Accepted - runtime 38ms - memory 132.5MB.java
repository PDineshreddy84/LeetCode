class Solution {
    public int[] findDiagonalOrder(List<List<Integer>> nums) {
        Map<Integer,List<Integer>>m=new HashMap<>();
        int max=0,c=0;
        for(int i=nums.size()-1;i>=0;i--){
            for(int j=0;j<nums.get(i).size();j++){
                max=Math.max(max,i+j);
                if(!m.containsKey(i+j)){
                    m.put(i+j,new ArrayList<>());
                }
                c++;
                m.get(i+j).add(nums.get(i).get(j));
            }
        }
        int ans[]=new int[c];
        int k=0;
        for(int i=0;i<=max;i++){
            for(int ele:m.get(i)){
                ans[k++]=ele;
            }
        }
        return ans;
    }
}