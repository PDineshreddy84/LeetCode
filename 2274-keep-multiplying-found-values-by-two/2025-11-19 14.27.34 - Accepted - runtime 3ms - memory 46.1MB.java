class Solution {
    public int findFinalValue(int[] nums, int o) {
        Set<Integer>st=new HashSet<>();
        for(int i:nums){
            st.add(i);
        }
        while(st.contains(o)){
            o*=2;
        }
        return o;
    }
}