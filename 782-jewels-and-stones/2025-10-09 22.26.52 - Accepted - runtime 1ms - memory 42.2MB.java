class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        int s=stones.length();
        int c=0;
        for(int i=0;i<s;i++){
            if(jewels.contains(stones.charAt(i)+"")){
                c++;
            }
        }
        return c;
    }
}