class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        int c1[]=new int[26];
        int c2[]=new int[26];
        int n1=p.length(),n2=s.length();
        if(n1>n2)return new ArrayList<>();
        List<Integer>l=new ArrayList<>();
        for(int i=0;i<n1;i++){
            c1[p.charAt(i)-'a']++;
            c2[s.charAt(i)-'a']++;
        }
        if(Arrays.equals(c1,c2)){
                l.add(0);
        }
        for(int i=n1;i<n2;i++){
            c2[s.charAt(i)-'a']++;
            c2[s.charAt(i-n1)-'a']--;
            if(Arrays.equals(c1,c2)){
                l.add(i-n1+1);
            }
        }
        return l;
    }
}