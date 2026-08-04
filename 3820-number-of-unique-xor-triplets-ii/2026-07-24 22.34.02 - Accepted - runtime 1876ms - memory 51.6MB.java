class Solution {
    public int uniqueXorTriplets(int[] nums) {
        Map<Integer,Integer> mp=new HashMap<>();
        int n=nums.length;
        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
                mp.putIfAbsent((nums[i]^nums[j]),j);
            }
        }
        Set<Integer> a=new HashSet<>();
        for(int k:mp.keySet()){
            for(int z=mp.get(k);z<n;z++){
                a.add((k^nums[z]));
            }
        }
        return a.size();
    }
}