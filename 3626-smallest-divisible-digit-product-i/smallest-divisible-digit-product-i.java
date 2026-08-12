class Solution {
    public int smallestNumber(int n, int t) {
        int i;
        for(i = n;i>=n;i++){
            int te = i,pro = 1;
            while(te != 0){
                int temp = te%10;
                pro*=temp;
                te/=10;
            }
            if(pro % t == 0){
                break;
            }
        }
        return i;
    }
}