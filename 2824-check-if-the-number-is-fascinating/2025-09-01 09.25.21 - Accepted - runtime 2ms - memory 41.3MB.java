class Solution {
    public boolean isFascinating(int n) {
        Set<Integer>s=new HashSet<>();
        int num=n;
        for(int i=1;i<4;i++){
            num=i*n;
            while(num!=0){
                int rem=num%10;
                if(s.contains(rem) || s.contains(0)){
                    return false;
                }
                s.add(rem);
                num/=10;
            }
        }
        System.out.print(s);
        return s.size()==9;
    }
}