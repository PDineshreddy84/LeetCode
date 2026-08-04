class Solution {
    public int averageValue(int[] nums) {
        List<Integer>l=new ArrayList<>();
        for(int ele:nums){
            if(ele%2==0 && ele%3==0){
                l.add(ele);
            }
        }
        int sum=0;
        for(int ele:l){
            sum+=ele;
        }
        if(l.size()==0){
            return 0;
        }
        return Math.round(sum/l.size());
    }
}