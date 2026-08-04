class Solution {
    public int findKthPositive(int[] arr, int k) {
        Set<Integer>s=new HashSet<>();
        List<Integer>l=new ArrayList<>();
        for(int num:arr){
            s.add(num);
        }
        int i=1;
        while(l.size()<1001){
            if(!s.contains(i)){
                l.add(i);
            }
            i++;
        }
        return l.get(k-1);
    }
}