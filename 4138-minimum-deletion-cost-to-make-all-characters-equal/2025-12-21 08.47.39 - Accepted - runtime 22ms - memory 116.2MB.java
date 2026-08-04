class Solution {
    public long minCost(String s, int[] cost) {
        Map<Character,Long>m1=new HashMap<>();
        int n=cost.length;
        for(int i=0;i<n;i++){
            long temp=m1.getOrDefault(s.charAt(i),0l);
            m1.put(s.charAt(i),temp+(long)cost[i]);
        }
        long tc=0;
        long max=0;
        for(char ch:m1.keySet()){
            max=Math.max(m1.get(ch),max);
            tc+=m1.get(ch);
        }
        return tc-max;
    }
}