class Solution {
    public int minMaxDifference(int num) {
        String str=num+"";
        char ch1[]=str.toCharArray();
        char ch2[]=str.toCharArray();
        int n=ch1.length;
        char re1='$',re2=ch1[0];
        for(int i=0;i<n;i++){
            if(ch1[i]!='9'){
                re1=ch1[i];
                break;
            }
        }
        for(int i=0;i<n;i++){
            if(ch1[i]==re1){
                ch1[i]='9';
            }
            if(ch2[i]==re2){
                ch2[i]='0';
            }
        }
        int max=Integer.parseInt(new String(ch1));
        int min=Integer.parseInt(new String(ch2));
        return max-min;
    }
}
