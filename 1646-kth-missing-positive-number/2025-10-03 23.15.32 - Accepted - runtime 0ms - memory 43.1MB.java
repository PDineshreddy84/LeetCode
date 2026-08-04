class Solution {
    public int findKthPositive(int[] arr, int k) {
        // Set<Integer>s=new HashSet<>();
        // List<Integer>l=new ArrayList<>();
        // for(int num:arr){
        //     s.add(num);
        // }
        // int i=1;
        // while(l.size()<1001){
        //     if(!s.contains(i)){
        //         l.add(i);
        //     }
        //     i++;
        // }
        // return l.get(k-1);
        int l=0,r=arr.length-1;
        while(l<=r){
            int m=l+(r-l)/2;
            int missing=arr[m]-(m+1);
            if(missing<k){
                l=m+1;
            }
            else{
                r=m-1;
            }
        }
        return l+k;
    }
}