class Solution {
    public int characterReplacement(String s, int k) {
        Map<Character,Integer>m=new HashMap<>();
        int n=s.length();
        int l=0,r=0,mf=0,ml=0;
        while(r<n){
            m.put(s.charAt(r),m.getOrDefault(s.charAt(r),0)+1);
            mf=Math.max(mf,m.get(s.charAt(r)));
           if((r-l+1)-mf>k){
            m.put(s.charAt(l),m.get(s.charAt(l))-1);
            while(m.get(s.charAt(l))==0){
                m.remove(s.charAt(l));
            }
            l++;
           }
           ml=Math.max(ml,r-l+1);
           r++;
        }
        return ml;
    }
}