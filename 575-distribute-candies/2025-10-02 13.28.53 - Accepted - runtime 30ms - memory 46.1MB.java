class Solution {
    public int distributeCandies(int[] candyType) {
        int n=candyType.length;
        Set<Integer>s=new HashSet<>();
        for(int i=0;i<n;i++){
            s.add(candyType[i]);
        }
        if((n/2)<s.size()){
            return n/2;
        }
        return s.size();
    }
}