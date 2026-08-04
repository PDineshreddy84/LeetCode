class Solution {
    public int maxBalancedSubarray(int[] nums) {
        int n=nums.length;
        Map<String,Integer>m=new HashMap<>();
        int prexor=0;
        int e=0,o=0;
        int max=0;
        m.put("0#0",-1);
        for(int i=0;i<n;i++){
            prexor^=nums[i];
            if(nums[i]%2==0){
                e++;
            }
            else{
                o++;
            }
            int p=e-o;
            String k=prexor+"#"+p;
            if(m.containsKey(k)){
                int l=i-m.get(k);
                max=Math.max(l,max);
            }
            else{
                m.put(k,i);
            }
        }
        return max;
    }
}