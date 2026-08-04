class Solution {
    static int arr[]=new int[100009];
    static{
        for(int i=0;i<arr.length;i++){
            int c=0;
            int w=i;
            while(w>0){
                c++;
                w=w&(w-1);
            }
            arr[i]=c;
        }
    }
    public int[] countBits(int n) {
        return Arrays.copyOfRange(arr,0,n+1);
    }
}