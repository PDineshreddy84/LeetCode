class Solution {
    public int removeStones(int[][] stones) {
        Disjoint ds=new Disjoint();
        for(int[] stone:stones){
            ds.union(stone[0],stone[1]+10001);
        }
        Set<Integer>s=new HashSet<>();
        for(int stone[]:stones){
            s.add(ds.find(stone[0]));
        }
        return stones.length-s.size();
    }
}
class Disjoint{
   Map<Integer,Integer>mp=new HashMap<>();
   public int find(int x){
        mp.putIfAbsent(x,x); 
        if(x!=mp.get(x)){
            mp.put(x,find(mp.get(x)));
        }
        return mp.get(x);
   }
   public void union(int u,int v){
        mp.put(find(u),find(v));
   }
}