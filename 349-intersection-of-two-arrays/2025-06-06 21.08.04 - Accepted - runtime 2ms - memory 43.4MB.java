class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer>s=new HashSet<>();
        for(int n:nums1){
            s.add(n);
        }
        Set<Integer>u=new HashSet<>();
        for(int n:nums2){
            if(s.contains(n)){
                u.add(n);
            }
        }
        int res[]=new int[u.size()];
        int i=0;
        for(int v:u){
            res[i++]=v;
        }
        return res;
    }
}