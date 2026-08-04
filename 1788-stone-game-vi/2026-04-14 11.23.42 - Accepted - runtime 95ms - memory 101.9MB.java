class Solution {
    public int stoneGameVI(int[] a, int[] b) {
        List<Group>l=new ArrayList<>();
        int n=a.length;
        for(int i=0;i<n;i++){
            l.add(new Group(a[i]+b[i],a[i],b[i]));
        }
        Collections.sort(l,(x,y)->{
            if(x.ts!=y.ts){
                return y.ts-x.ts;
            }
            else{
                return y.as-x.as;
            }
        });
        int ats=0,bts=0;
        for(int i=0;i<n;i++){
            if(i%2==0){
                ats+=l.get(i).as;
            }
            else{
                bts+=l.get(i).bs;
            }
        }
        if(ats>bts)return 1;
        if(ats<bts)return -1;
        return 0;
    }
}
class Group{
    int ts,as,bs;
    Group(int ts,int as,int bs){
        this.ts=ts;
        this.as=as;
        this.bs=bs;
    }
}