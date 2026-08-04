class Solution {
    public int maxCapacity(int[] costs, int[] capacity, int budget) {
        TreeMap<Integer,Integer>m=new TreeMap<>(Comparator.reverseOrder());
        for(int i=0;i<capacity.length;i++){
            m.put(capacity[i],costs[i]);
        }
        int cc=0,c=0;
        for (Map.Entry<Integer, Integer> entry :m.entrySet()) {
            Integer key = entry.getKey();
            Integer value = entry.getValue();
            if(c+value<budget){
                c+=value;
                cc+=key;
            }
        }
    return cc;
    }
}