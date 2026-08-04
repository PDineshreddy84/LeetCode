class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int tsg=0,tsc=0,n=gas.length;
        for(int i=0;i<n;i++){
            tsg+=gas[i];
            tsc+=cost[i];
        }
        if(tsg<tsc)return -1;
        int st=0,cg=0;
        for(int i=0;i<n;i++){
            cg+=gas[i]-cost[i];
            if(cg<0){
                st=i+1;
                cg=0;
            }
        }
        return st;
    }
}