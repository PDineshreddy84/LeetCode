class Solution {
    public int sumFourDivisors(int[] nums) {
        int n=nums.length;
        List<Integer>l=new ArrayList<>();
        for(int num:nums){
            int c=2;
            int sum=1+num;
            for(int i=2;i*i<=num;i++){
                if(num%i==0){
                    if(i!=num/i){
                        sum+=i;
                        sum+=num/i;
                        c+=2;
                    }
                    else{
                        sum+=i;
                        c++;
                    }
                    if(c>4){
                        break;
                    }
                }
            }
            if(c==4){
                l.add(sum);
            }
        }
        int res=0;
        for(int ele:l){
            res+=ele;
        }
        return res;
    }
}