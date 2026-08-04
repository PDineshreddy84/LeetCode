class Solution {
    public int numOfUnplacedFruits(int[] fruits, int[] baskets) {
        int n1=fruits.length,n2=baskets.length;
        List<Integer>l=new ArrayList<>();
        for(int i=0;i<n1;i++){
            for(int j=0;j<n2;j++){
                if(!l.contains(j) && fruits[i]<=baskets[j]){
                    l.add(j);
                    break;
                }
            }
        }
        return n2-l.size();
    }
}