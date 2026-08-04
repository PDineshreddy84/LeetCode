class Solution {
    public int maxFreqSum(String s) {
        int m1=0,m2=0;
        int freq[]=new int[26];
        for(int i=0;i<s.length();i++){
            freq[s.charAt(i)-'a']++;
        }
        for(int i=0;i<26;i++){
            if(m2<freq[i] && i!=0 && i!=4 && i!=8 && i!=14 && i!=20){
                m2=freq[i];
            }
            else if(m1<freq[i] && (i==0 || i==4 || i==8 ||i==14||i==20)){
                m1=freq[i];
            }
        }
        
        return m1+m2;
    }
}