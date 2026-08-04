class Solution {
    public int minMirrorPairDistance(int[] nums) {
        Map<Integer,Integer>m=new HashMap<>();
        int n=nums.length;
        for(int i=0;i<n;i++){
            m.put(nums[i],i);
        }
        int min=Integer.MAX_VALUE;
        for(int i=0;i<n;i++){
            int t=reverse(nums[i]);
            if(m.containsKey(t) && i<m.get(t)){
                min=Math.min(min,Math.abs(m.get(t)-i));
            }
        }
        return min==Integer.MAX_VALUE?-1:min;
    }
    int reverse(int n){
        int rev=0;
        while(n!=0){
            rev=rev*10+(n%10);
            n/=10;
        }
        return rev;
    }
}