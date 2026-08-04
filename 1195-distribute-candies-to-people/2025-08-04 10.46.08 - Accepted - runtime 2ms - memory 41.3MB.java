class Solution {
    public int[] distributeCandies(int c, int n) {
        int arr[]=new int[n];
        int i=0,k=1;
        while(c>0){
            if(i>n-1){
                i=0;
            }
            arr[i]=arr[i]+k;
            c=c-k;
            i++;
            k++;
        }
        if(c<0){
            arr[i-1]+=c;
        }
        return arr;
    }
}