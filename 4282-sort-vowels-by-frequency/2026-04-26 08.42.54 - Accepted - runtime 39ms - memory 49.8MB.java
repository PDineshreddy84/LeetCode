class Solution {
    public String sortVowels(String s) {
        String vow="aeiou";
        StringBuilder sb=new StringBuilder(s);
        Map<Character,Integer>m=new LinkedHashMap<>();
        for(char ch:s.toCharArray()){
            if(vow.contains(ch+"")){
                m.put(ch,m.getOrDefault(ch,0)+1);
            }
        }
        List<Map.Entry<Character,Integer>>l=new ArrayList<>(m.entrySet());
        Collections.sort(l,(a,b)->b.getValue().compareTo(a.getValue()));
        Map<Character,Integer>lm=new LinkedHashMap<>();
        for(Map.Entry<Character,Integer>entry:l){
            lm.put(entry.getKey(),entry.getValue());
        }
        int ind=0;
        for(Map.Entry<Character,Integer>e:lm.entrySet()){
            char key=e.getKey();
            int v=e.getValue();
            while(v>0){
                if(vow.contains(sb.charAt(ind)+"")){
                    sb.setCharAt(ind,key);
                    v--;
                }
                ind++;
            }
        }
        return sb.toString();
    }
}