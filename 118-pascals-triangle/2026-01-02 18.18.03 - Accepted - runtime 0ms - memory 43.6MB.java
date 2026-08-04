class Solution {
    public List<List<Integer>> generate(int n) {
        List<List<Integer>>l=new ArrayList<>();
        for(int i=1;i<=n;i++){
            l.add(genRows(i));
        }
        return l;
    }
    public static List<Integer> genRows(int r){
        List<Integer>l=new ArrayList<>();
        int ans=1;
        l.add(1);
        for(int c=1;c<r;c++){
            ans=ans*(r-c);
            ans=ans/c;
            l.add(ans);
        }
        return l;
    }
}