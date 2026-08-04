class Solution {
    public int largestAltitude(int[] gain) {
        int arr[]=new int[gain.length+1];
        arr[0]=0;
        arr[1]=gain[0];
        int sum=0,m=Math.max(arr[0],arr[1]);
        for(int i=2;i<arr.length;i++){
            arr[i]=arr[i-1]+gain[i-1];
            if(m<arr[i]){
                m=arr[i];
            }
        }
        return m;
    }
}