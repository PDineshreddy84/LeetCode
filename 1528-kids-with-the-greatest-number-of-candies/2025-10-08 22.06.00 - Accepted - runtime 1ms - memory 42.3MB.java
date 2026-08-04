class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean>l=new ArrayList<>();
        int max=candies[0];
        int n=candies.length;
        for(int i=1;i<n;i++){
            max=Math.max(candies[i],max);
        }
        for(int i=0;i<n;i++){
            if(candies[i]+extraCandies >= max){
                l.add(true);
            }
            else{
                l.add(false);
            }
        }
        return l;
    }
}