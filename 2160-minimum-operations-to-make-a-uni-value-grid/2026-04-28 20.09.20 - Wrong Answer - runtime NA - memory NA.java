class Solution {
    public int minOperations(int[][] grid, int x) {
        List<Integer>l=new ArrayList<>();
        for(int gr[]:grid){
            for(int ele:gr){
                l.add(ele);
            }
        }
        int n=l.size();
        int c=0;
        int med=l.get(n/2);
        for(int ele:l){
            if(ele%x!=0){
                return -1;
            }
            else{
                c+=Math.abs(med-ele)/x;
            }
        }
        return c;
    }
}