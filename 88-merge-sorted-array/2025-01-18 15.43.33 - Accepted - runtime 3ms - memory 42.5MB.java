class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int z=0,temp=0;
        for(int i=0;i<(m+n);i++){
            if(nums1[i]==0 && z<n){
                nums1[i]=nums2[z];
                z++;
            }
        }  
        // for(int i=0;i<(m+n)-1;i++){
        //     for(int j=i+1;j<(m+n);j++){
        //         if(nums1[i]>nums1[j]){
        //             temp=nums1[i];
        //             nums1[i]=nums1[j];
        //             nums1[j]=temp;
        //         }
        //     }
        // }
        Arrays.sort(nums1);
        System.out.println(nums1);
    }
}