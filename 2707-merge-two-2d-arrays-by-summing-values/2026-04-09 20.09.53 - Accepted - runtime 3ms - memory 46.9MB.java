class Solution {
    public int[][] mergeArrays(int[][] nums1, int[][] nums2) {
        int m=nums1.length,n=nums2.length;
        Map<Integer,Integer>map=new TreeMap<>();
        for(int i=0;i<m;i++){
            map.put(nums1[i][0],nums1[i][1]);
        }
        for(int i=0;i<n;i++){
            int v=0;
            if(map.containsKey(nums2[i][0])){
                v=map.get(nums2[i][0]);
            }
            map.put(nums2[i][0],v+nums2[i][1]);
        }
        int res[][]=new int[map.size()][2];
        int i=0;
        for(Map.Entry<Integer,Integer> e : map.entrySet()){
            res[i][0]=e.getKey();
            res[i][1]=e.getValue();
            i++;
        }
        return res;
    }
}