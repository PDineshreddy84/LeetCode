class Solution {
    public List<Integer> findWordsContaining(String[] words, char x) {
        int n=words.length;
        List<Integer>l=new ArrayList<>();
        for(int i=0;i<n;i++){
            if(words[i].contains(x+"")){
                l.add(i);
            }
        }
        return l;
    }
}