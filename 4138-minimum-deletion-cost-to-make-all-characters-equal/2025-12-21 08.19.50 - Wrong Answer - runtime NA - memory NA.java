class Solution {
    public long minCost(String s, int[] cost) {
        Map<Character,Long>m1=new HashMap<>();
        Map<Character,Long>m2=new HashMap<>();
        int n=cost.length;
        for(int i=0;i<n;i++){
            m1.put(s.charAt(i),m1.getOrDefault(s.charAt(i),0l)+1);
        }
        for(int i=0;i<n;i++){
            m2.put(s.charAt(i),(long)cost[i]);
        }
        long c=0;
        for(char ch:m1.keySet()){
            if(m1.get(ch)==1){
                c=Math.max(c,m2.get(ch));
            }
        }
        long tc=0;
        if(c!=0){
            for(int i=0;i<n;i++){
                tc+=(long)cost[i];
            }
        }
        return tc-c;
    }
}