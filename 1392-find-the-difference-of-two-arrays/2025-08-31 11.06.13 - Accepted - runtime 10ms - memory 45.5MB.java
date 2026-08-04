class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        Set<Integer>s1=new HashSet<>();
        Set<Integer>s2=new HashSet<>();
        List<Integer>l1=new ArrayList<>();
        List<Integer>l2=new ArrayList<>();
        for(int ele:nums1){
            s1.add(ele);
        }
        for(int ele:nums2){
            s2.add(ele);
        }
        for(int ele:s1){
            if(!(s2.contains(ele))){
                l1.add(ele);
            }
        }
        for(int ele:s2){
            if(!(s1.contains(ele))){
                l2.add(ele);
            }
        }
        return Arrays.asList(l1,l2);
    }
}