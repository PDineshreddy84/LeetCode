class Solution {
    public int numOfUnplacedFruits(int[] fruits, int[] baskets) {
        Arrays.sort(fruits);
        Arrays.sort(baskets);
        if(fruits[fruits.length-1]<=baskets[baskets.length-1]){
            return 0;
        }
        else 
            return 1;
    }
}