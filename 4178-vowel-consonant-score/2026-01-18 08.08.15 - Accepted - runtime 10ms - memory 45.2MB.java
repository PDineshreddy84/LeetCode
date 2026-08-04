class Solution {
    public int vowelConsonantScore(String s) {
        String str=s.replaceAll("[^a-z]","");
        int len=str.length();
        int cv=count(str);
        int cc=len-cv;
        if(cc>0){
            return cv/cc;
        }
        return 0;
    }
    public int count(String str){
        int c=0;
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if(ch=='a'||ch=='e'||ch=='o'||ch=='i'||ch=='u'){
                c++;
            }
        }
        return c;
    }
}