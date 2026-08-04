class Solution {
    public int maximumSum(int[] nums) {
        List<Integer>l1=new ArrayList<>();
        List<Integer>l2=new ArrayList<>();
        List<Integer>l3=new ArrayList<>();
        for(int num:nums){
            if(num%3==0){
                l1.add(num);
            }
            else if(num%3==1){
                l2.add(num);
            }
            else{
                l3.add(num);
            }
        }
        Collections.sort(l1,Collections.reverseOrder());
        Collections.sort(l2,Collections.reverseOrder());
        Collections.sort(l3,Collections.reverseOrder());
        int res=0;
        if(l1.size()>=3){
            res=Math.max(res,l1.get(0)+l1.get(1)+l1.get(2));
        }
        if(l2.size()>=3){
            res=Math.max(res,l2.get(0)+l2.get(1)+l2.get(2));
        }
        if(l3.size()>=3){
            res=Math.max(res,l3.get(0)+l3.get(1)+l3.get(2));
        }
        if(l1.size()>=1 && l2.size()>=1 && l3.size()>=1){
            res=Math.max(res,l1.get(0)+l2.get(0)+l3.get(0));
        }
        return res;
    }
}