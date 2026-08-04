class Solution {
    public int minOperations(int[] nums) {
        int n=nums.length;
        int d=0;
        Map<Integer,Integer>m=new HashMap<>();
        for(int num:nums){
            m.put(num,m.getOrDefault(num,0)+1);
            if(m.get(num)==2){
                d++;
            }
        }
        int c=0,i=0;
        while(d>0 && i<n){
            for(int k=0;k<3&&i<n;i++,k++){
                int ele=nums[i];
                m.put(ele,m.get(ele)-1);
                if(m.get(ele)==1){
                    d--;
                }
            }
            c++;
        }
        return c;
    }
}