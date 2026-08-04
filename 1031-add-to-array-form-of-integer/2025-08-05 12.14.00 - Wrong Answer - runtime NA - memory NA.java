class Solution {
    public List<Integer> addToArrayForm(int[] num, int k) {
        List<Integer>l=new ArrayList<>();
        int n=num.length,c=0;
        for(int i=n-1;i>-1;i--){
            int r=k%10;
            k/=10;
            num[i]+=r;
            if(c==1){
                num[i]+=1;
                c=0;
            }
            if(i==0&&num[i]>9&&n>1){
                l.add(0);
                 num[0]+=1;
            }
            if(num[i]>9){
                num[i]=num[i]%10;
                c=1;
            }
            l.add(num[i]);
        }
        if(k!=0){
            while(k!=0){
                int r=k%10;
                if(c==1){
                    r+=c;
                    c=0;
                    if(r>9){
                        r=0;
                        c=1;
                    }
                }
                l.add(r);
                k/=10;
            }
            if(c==1){
                l.add(c);
            }
        }
        Collections.reverse(l);
        return l;
    }
}