class Solution {
    public boolean checkIfExist(int[] arr) {
        // int n=arr.length;
        // Arrays.sort(arr);
        // for(int i=0;i<n;i++){
        //     int l=0,r=n-1;
        //     while(l<=r){
        //         int m=l+(r-l)/2;
        //         if(i!=m && arr[m]==2*arr[i]){
        //             return true;
        //         }
        //         else if(2*arr[i]<arr[m]){
        //             r=m-1;
        //         }
        //         else{
        //             l=m+1;
        //         }
        //     }
        // }
        // return false;
        Set<Integer>s=new HashSet<>();
        for(int num:arr){
            if(s.contains(2*num) || (num%2==0 && s.contains(num/2))){
                return true;
            }
            s.add(num);
        }
        return false;
    }
}