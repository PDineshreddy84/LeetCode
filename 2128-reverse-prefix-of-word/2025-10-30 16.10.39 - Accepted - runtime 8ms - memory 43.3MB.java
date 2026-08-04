class Solution {
    public String reversePrefix(String word, char ch) {
        String res="";
        int n=word.length();
        int c=1;
        boolean flag=false;
        for(int i=0;i<n;i++){
           if(word.charAt(i)==ch){
             res+=word.charAt(i);
             flag=true;
             break;
           }
           else{
            res+=word.charAt(i);
           }
           c++;
        }
        String don="";
        if(!flag){
            return word;
        }
        for(int i=res.length()-1;i>=0;i--){
            don+=res.charAt(i);
        }
        for(int i=c;i<word.length();i++){
            don+=word.charAt(i);
        }
        return don;
    }

}