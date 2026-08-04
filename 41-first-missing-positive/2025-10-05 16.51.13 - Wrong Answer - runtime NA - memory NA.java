class Solution {
    public int firstMissingPositive(int[] arr) {
        int n=arr.length;
        int i=0;
        while(i<n){
            int c=arr[i]-1;
            if(c>=0 && c<n && arr[i]!=arr[c]){
                int t=arr[i];
                arr[i]=arr[c];
                arr[c]=t;
            }
            else{
                i++;
            }
        }
        for(int k=1;k<n;k++){
            if(arr[k-1]!=k){
                return k;
            }
        }
        return n;
    }
}