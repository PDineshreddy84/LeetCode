class Solution {
    public int maximumLengthSubstring(String s) {
        Map<Character,Integer>m=new HashMap<>();
        int l=0,ml=0,len=0,n=s.length();
        for(int i=0;i<n;i++){
            m.put(s.charAt(i),m.getOrDefault(s.charAt(i),0)+1);
            while(m.get(s.charAt(i))>2){
                m.put(s.charAt(l),m.get(s.charAt(l))-1);
                if(m.get(s.charAt(l))==0){
                    m.remove(s.charAt(l));
                }
                l++;
            }
            len=i-l+1;
            ml=Math.max(ml,len);
        }
        return ml;
    }
}