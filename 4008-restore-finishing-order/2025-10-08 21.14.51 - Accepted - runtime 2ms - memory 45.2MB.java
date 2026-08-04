class Solution {
    public int[] recoverOrder(int[] order, int[] friends) {
        Set<Integer>s=new HashSet<>();
        for(int num:friends){
            s.add(num);
        }
        int n=friends.length;
        int res[]=new int[n];
        int k=0;
        for(int i=0;i<order.length;i++){
            if(s.contains(order[i])){
                res[k]=order[i];
                k++;
            }
        }
        return res;
    }
}