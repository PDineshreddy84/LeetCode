class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int l=nums1.length+nums2.length;
        int arr[]=new int[l];
        float ans=0;
        int j=0;
        for(int i=0;i<l;i++){
            if(i<nums1.length){
            arr[i]=nums1[i];
            }
            else{
                arr[i]=nums2[j];
                j++;
            }
        }
        Arrays.sort(arr);
        if(l%2==0){
            ans=(float)(arr[l/2]+arr[(l/2)-1])/2;
        }
        else{
            ans=(float)arr[l/2];
        }
        return ans;
    }
}