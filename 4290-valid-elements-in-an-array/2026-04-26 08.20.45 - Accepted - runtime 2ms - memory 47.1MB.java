class Solution {
    public List<Integer> findValidElements(int[] nums) {
        int ind=0;
        int max=0;
        List<Integer>l=new ArrayList<>();
        int n=nums.length;
        l.add(nums[0]);
        max=nums[0];
        for(int i=1;i<n;i++){
            if(nums[i]>max){
                l.add(nums[i]);
                ind=i;
            }
            max=Math.max(max,nums[i]);
        }
        Stack<Integer>s=new Stack<>();
        if(n-1!=ind){
            s.push(nums[n-1]);
            max=nums[n-1];
        }
        for(int i=n-2;i>ind;i--){
            if(nums[i]>max){
                s.push(nums[i]);
            }
            max=Math.max(max,nums[i]);
        }
        while(!s.isEmpty()){
            l.add(s.pop());
        }
        return l;
    }
}