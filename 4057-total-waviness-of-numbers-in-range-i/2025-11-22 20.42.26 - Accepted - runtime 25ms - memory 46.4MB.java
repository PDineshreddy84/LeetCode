class Solution {
    public int totalWaviness(int num1, int num2) {
        int t=0;
        for(int i=num1;i<=num2;i++){
            t+=waviness(i);
        }
        return t;
    }
    public int waviness(int n){
        int c=0;
       char arr[]=String.valueOf(n).toCharArray();
        int len=arr.length;
        if(len<3){
            return 0;
        }
        for(int i=1;i<len-1;i++){
            int l=arr[i-1]-'0';
            int m=arr[i]-'0';
            int r=arr[i+1]-'0';
            if((m>l && m>r)||(m<l && m<r)){
                c++;
            }
        }
            return c;
    }
}