class Solution {
    public List<Integer> selfDividingNumbers(int l, int r) {
        List<Integer>li=new ArrayList<>();
            for(int i=l;i<=r;i++){
                if(isTrue(i)){
                    li.add(i);
                }
        }
        return li;
    }
    static boolean isTrue(int num){
        int n=num;
        while(num!=0){
           int rem=num%10;
            if(rem==0 || n%rem!=0){
                return false;
            }
            num/=10;
        }
        return true;
    }
}