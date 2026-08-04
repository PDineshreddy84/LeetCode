class Solution {
    public int numOfUnplacedFruits(int[] fruits, int[] baskets) {
        int n1=fruits.length,n2=baskets.length;
        Set<Integer>s=new HashSet<>();
        for(int i=0;i<n1;i++){
            for(int j=0;j<n2;j++){
                if(!s.contains(j) && fruits[i]<=baskets[j]){
                    s.add(j);
                    break;
                }
            }
        }
        return n2-s.size();
    }
}