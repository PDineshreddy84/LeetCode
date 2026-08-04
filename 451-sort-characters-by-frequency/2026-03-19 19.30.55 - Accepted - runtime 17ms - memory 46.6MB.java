class Solution {
    public String frequencySort(String s) {
        int n=s.length();
        Map<Character,Integer>m=new HashMap<>();
        for(int i=0;i<n;i++){
            m.put(s.charAt(i),m.getOrDefault(s.charAt(i),0)+1);
        }
        List<Map.Entry<Character,Integer>>l=new ArrayList<>(m.entrySet());
        l.sort((a,b)->b.getValue()-a.getValue());
        StringBuilder res=new StringBuilder();
        for(Map.Entry<Character,Integer>e:l){
            int f=e.getValue();
            res.append(String.valueOf(e.getKey()).repeat(f));
        }
        return res.toString();
    }
}