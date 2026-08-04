class Solution {
    public int sumOddLengthSubarrays(int[] arr) {
        int n=arr.length,sum=0;
        for(int i=0;i<n;i++){
            int t=(i+1)*(n-i);
            int o=(t+1)/2;
            sum+=arr[i]*o;
        }
        // int i=1;
        // while(i<=n){
        //     int j=0,k=0;
        //     while(j<n){
        //         sum+=arr[j];
        //         j++;
        //         if(j==i+k){
        //             k++;
        //             j=k;
        //             if(j+i>n){
        //                 break;
        //             }
        //         }
        //     }
        //     i+=2;
        // }
         return sum;
    }
}