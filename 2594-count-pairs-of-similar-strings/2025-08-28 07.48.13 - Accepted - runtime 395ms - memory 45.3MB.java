class Solution {
    public int similarPairs(String[] words) {
        int count=0;
        int n=words.length;
        for(int i=0;i<n-1;i++){
            for(int j=i+1;j<n;j++){
                count+=check(words[i],words[j]);
            }
        }
        return count;
    }
    public int check(String s,String t){
        Set<Character>s1=new HashSet<>();
        Set<Character>t1=new HashSet<>();
        for(char ch:s.toCharArray()){
            s1.add(ch);
        }
        for(char ch:t.toCharArray()){
            t1.add(ch);
        }
        return s1.equals(t1)?1:0;
    }
}