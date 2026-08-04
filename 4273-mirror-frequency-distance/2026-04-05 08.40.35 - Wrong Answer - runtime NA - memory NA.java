class Solution {
    public int mirrorFrequency(String str) {
        Map<Character,Character>m=new HashMap<>();
        char s='a',e='z';
        for(int i=0;i<13;i++){
            m.put(s,e);
            m.put(e,s);
            s++;
            e--;
        }
        s='0';
        e='9';
        for(int i=0;i<5;i++){
            m.put(s,e);
            m.put(e,s);
            s++;
            e--;
        }
        Map<Character,Integer>f=new HashMap<>();
        for(char ch:str.toCharArray()){
            f.put(ch,f.getOrDefault(ch,0)+1);
        }
        int c=0;
        for(char ch: str.toCharArray()){
            if(!f.containsKey(m.get(ch)) && f.containsKey(ch)){
                c++;
            }
            else if(f.containsKey(m.get(ch)) && f.containsKey(ch)){
                f.put(ch,f.get(ch)-1);
                f.put(m.get(ch),f.get(m.get(ch))-1);
                if(f.get(ch)==0){
                    f.remove(ch);
                }
                if(f.get(m.get(ch))==0){
                    f.remove(m.get(ch));
                }
            }
        }
        return c;
    }
}