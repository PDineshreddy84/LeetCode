class Solution {
    public int totalFruit(int[] fruits) {
        int n=fruits.length;
        int l=0,r=0,ml=0;
        Map<Integer,Integer>m=new HashMap<>();
        while(r<n){
            m.put(fruits[r],m.getOrDefault(fruits[r],0)+1);
            if(m.size()>2){
                m.put(fruits[l],m.get(fruits[l])-1);
                if(m.get(fruits[l])==0){
                    m.remove(fruits[l]);
                }
                l++;
            }
            ml=Math.max(ml,r-l+1);
            r++;
        }
        return ml;
    }
}