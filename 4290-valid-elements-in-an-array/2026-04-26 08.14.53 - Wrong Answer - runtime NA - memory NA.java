class Solution {
    public List<Integer> findValidElements(int[] nums) {
        int ind=0;
        List<Integer>l=new ArrayList<>();
        int n=nums.length;
        l.add(nums[0]);
        for(int i=1;i<n;i++){
            if(nums[i]>nums[i-1]){
                l.add(nums[i]);
                ind=i;
            }
            else{
                break;
            }
        }
        Stack<Integer>s=new Stack<>();
        if(n-1!=ind){
            s.push(nums[n-1]);
        }
        for(int i=n-2;i>ind;i--){
            if(nums[i]>nums[i+1]){
                s.push(nums[i]);
            }
            else{
               break;
            }
        }
        while(!s.isEmpty()){
            l.add(s.pop());
        }
        return l;
    }
}