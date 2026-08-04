class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        // int res[]=new int[m+n];
        // int i=0,j=0,k=0;
        // while(i<m && j<n){
        //     if(nums1[i]<=nums2[j]){
        //         res[k]=nums1[i++];
        //     }
        //     else{
        //         res[k]=nums2[j++];
        //     }
        //     k++;
        // }
        // while(i<m){
        //     res[k++]=nums1[i++];
        // }
        // while(j<n){
        //     res[k++]=nums2[j++];
        // }
        // for(i=0;i<m+n;i++){
        //     nums1[i]=res[i];
        // }
        if(n==0){
            return;
        }
        int len=(m+n);
        int gap=(len/2)+(len%2);
        while(gap>0){
            int l=0;
            int r=l+gap;
            while(r<len){
                if(l<m && r>=m){
                    swap(nums1,nums2,l,r-m);
                }
                else if(l>=m){
                    swap(nums1,nums2,l-m,r-m);
                }
                else{
                    swap(nums1,nums2,l,r);
                }
                l++;r++;
            }
            if(gap==1){
                break;
            }
            gap=(gap/2)+(gap%2);
        }
        for(int i=m;i<len;i++){
            nums1[i]=nums2[i-m];
        }
    }
    public static void swap(int nums1[],int nums2[],int i1,int i2){
        if(nums1[i1]>nums2[i2]){
            int t=nums1[i1];
            nums1[i1]=nums2[i2];
            nums2[i2]=t;
        }
    }
}