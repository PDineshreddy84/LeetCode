class Solution {
    public List<Integer> addToArrayForm(int[] num, int k) {
        List<Integer>l=new ArrayList<>();
        int n=num.length,c=0;
        if(n==1){
            while(k!=0){
                int r=k%10;
             l.add(r);
             k/=10;
            }
        }
        else{
        for(int i=n-1;i>-1;i--){
            int r=k%10;
            k/=10;
            num[i]+=r;
            if(c==1){
                num[i]+=1;
                c=0;
            }
            if(i==0&&num[i]>9){
                l.add(0);
                 num[0]+=1;
            }
            if(num[i]>9){
                num[i]=num[i]%10;
                c=1;
            }
            l.add(num[i]);
        }}
        Collections.reverse(l);
        return l;
    }
}