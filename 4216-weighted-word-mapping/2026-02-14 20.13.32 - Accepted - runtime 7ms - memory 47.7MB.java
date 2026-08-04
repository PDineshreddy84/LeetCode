class Solution {
    public String mapWordWeights(String[] words, int[] weights) {
        Map<Character,Integer>m=new HashMap<>();
        Map<Integer,Character>f=new HashMap<>();
        char ch='a';
        for(int i=25;i>=0;i--){
            f.put(i,ch);
            ch++;
        }
        ch='a';
        for(int i=0;i<26;i++){
            m.put(ch,weights[i]);
            ch++;
        }
        int sum=0;
        String ans="";
        for(String word:words){
            sum=0;
            for(int i=0;i<word.length();i++){
                sum+=m.get(word.charAt(i));
            }
            sum=sum%26;
            ans=ans+f.get(sum);
        }
        return ans;
    }
}