class Solution {
    public String lastNonEmptyString(String s) {
        int n=s.length();
        Map<Character,Integer>m=new HashMap<>();
        for(char ch:s.toCharArray()){
            m.put(ch,m.getOrDefault(ch,0)+1);
        }
        int hf=0;
        for(char ch:m.keySet()){
            int f=m.get(ch);
            if(f>hf){
                hf=f;
            }
        }
        StringBuilder str=new StringBuilder();
        for(int i=n-1;i>=0;i--){
            char ch=s.charAt(i);
            if(m.containsKey(ch) && m.get(ch)==hf){
                str.append(ch);
                m.remove(ch);
            }
        }
        return str.reverse().toString();
    }
}