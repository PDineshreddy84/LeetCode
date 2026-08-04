class Solution {
    public int findKthPositive(int[] arr, int k) {
        Set<Integer>s=new HashSet<>();
        List<Integer>l=new ArrayList<>();
        for(int num:arr){
            s.add(num);
        }
        for(int i=1;i<1001;i++){
            if(!s.contains(i)){
                l.add(i);
            }
        }
        return l.get(k-1).intValue();
    }
}