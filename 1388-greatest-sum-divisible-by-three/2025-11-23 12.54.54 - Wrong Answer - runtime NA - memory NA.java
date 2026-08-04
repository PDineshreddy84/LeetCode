class Solution {
    public int maxSumDivThree(int[] nums) {
        int sum=0;
        List<Integer>r1=new ArrayList<>();
        List<Integer>r2=new ArrayList<>();
        for(int num:nums){
            sum+=num;
            if(num%3==1){
                r1.add(num);
            }
            if(num%3==2){
                r2.add(num);
            }
        }
        if(sum%3==0){
            return sum;
        }
        Collections.sort(r1);
        Collections.sort(r2);
        int r=sum%3;
        int ans=0;
        if(r==1){
            int op1=r1.size()>=1?sum-r1.get(0):0;
            int op2=r1.size()>=2?sum-r1.get(0)-r1.get(1):0;
            ans=Math.max(op1,op2);
        }
        else{
            int op1=r2.size()>=1?sum-r2.get(0):0;
            int op2=r2.size()>=2?sum-r2.get(0)-r2.get(1):0;
            ans=Math.max(op1,op2);
        }
        return ans;
    }
}