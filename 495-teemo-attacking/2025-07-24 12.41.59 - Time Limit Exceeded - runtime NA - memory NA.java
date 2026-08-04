class Solution {
    public int findPoisonedDuration(int[] t, int d) {
        int l=t.length;
        int tw=0;
        Set<Integer>res=new HashSet<>();
        for(int i=0;i<l;i++){
            tw=0;
            while(tw!=d){
                res.add(t[i]++);
                tw++;
            }
        }
        return res.size();
    }
}