class Solution {
    public int minPartitions(String n) {
        int m=0;
        for(char ch:n.toCharArray()){
            if(ch-'0'==9)return 9;
            if(ch-'0'>m){
                m=ch-'0';
            }
        }
        return m;
    }
}
