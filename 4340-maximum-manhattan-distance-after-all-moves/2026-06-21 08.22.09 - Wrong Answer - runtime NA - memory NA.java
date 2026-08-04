class Solution {
    public int maxDistance(String moves) {
        int n=moves.length();
        Map<Character,Integer>m=new HashMap<>();
        for(char ch:moves.toCharArray()){
            m.put(ch,m.getOrDefault(ch,0)+1);
        }
        char f=' ';
        int max=0;
        for(char x:m.keySet()){
            if(x!='_' && max<m.get(x)){
                f=x;
                max=m.get(x);
            }
        }
        m.put(f,m.getOrDefault(f,0)+m.getOrDefault('_',0));
       int d1=m.getOrDefault('R',0)-m.getOrDefault('L',0);
       int d2=m.getOrDefault('U',0)-m.getOrDefault('D',0);
        return Math.abs(0-d1)+Math.abs(0-d2);
    }
}