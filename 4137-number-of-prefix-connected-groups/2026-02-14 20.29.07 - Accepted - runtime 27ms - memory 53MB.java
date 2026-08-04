class Solution {
    public int prefixConnected(String[] words, int k) {
        Map<String,Integer>m=new HashMap<>();
        for(String word:words){
            if(k<=word.length()){
                m.put(word.substring(0,k),m.getOrDefault(word.substring(0,k),0)+1);
            }
        }
        // System.out.println(m);
        int c=0;
        for(Map.Entry<String,Integer>e:m.entrySet()){
            int v=e.getValue();
            if(v>1){
                c++;
            }
        }
        return c;
    }
}