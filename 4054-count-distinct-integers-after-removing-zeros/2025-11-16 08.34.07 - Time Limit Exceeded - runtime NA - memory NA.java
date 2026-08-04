class Solution {
    public long countDistinct(long n) {
        Set<Integer>set=new HashSet<>();
        for(int x=1;x<=n;x++){
            String s=Integer.toString(x).replace("0","");
            int val=s.isEmpty()?0:Integer.parseInt(s);
                set.add(val);
        }
        return set.size();
    }
}