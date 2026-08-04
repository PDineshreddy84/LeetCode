class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer>l=new ArrayList<>();
        int n=nums.length;
        int freq[]=new int[(int)1e5+1];
        for(int i=0;i<n;i++){
            freq[nums[i]]++;
        }
        for(int i=1;i<=n;i++){
            if(freq[i]==0){
                l.add(i);
            }
        }
        return l;
    }
}