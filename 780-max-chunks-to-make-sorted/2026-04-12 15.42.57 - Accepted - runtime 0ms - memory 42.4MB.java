class Solution {
    public int maxChunksToSorted(int[] arr) {
        int n=arr.length;
        int c=0,ps=0,sps=0;
        for(int i=0;i<n;i++){
            ps+=arr[i];
            sps+=i;
            if(ps==sps)c++;
        }
        return c;
    }
}