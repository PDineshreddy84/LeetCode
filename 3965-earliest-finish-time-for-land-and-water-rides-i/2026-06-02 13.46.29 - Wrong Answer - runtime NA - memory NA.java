class Solution {
    public int earliestFinishTime(int[] landStartTime, int[] landDuration, int[] waterStartTime, int[] waterDuration) {
        int n1=landStartTime.length;
        int n2=waterStartTime.length;
        Map<Integer,Integer>m1=new HashMap<>();
        Map<Integer,Integer>m2=new HashMap<>();
        for(int i=0;i<n1;i++){
            m1.put(landStartTime[i],landDuration[i]);
        }
        for(int i=0;i<n2;i++){
            m2.put(waterStartTime[i],waterDuration[i]);
        }
        int l1=100000,l2=100000;
        for(int i=0;i<n1;i++){
            l1=Math.min(landDuration[i],l1);
            l2=Math.min(landStartTime[i]+m1.get(landStartTime[i]),l2);
        }
        int w1=100000,w2=100000;
        for(int i=0;i<n2;i++){
            w1=Math.min(waterDuration[i],w1);
            w2=Math.min(waterStartTime[i]+m2.get(waterStartTime[i]),w2);
        }
        return Math.min(l1+w2,l2+w1);
    }
}
