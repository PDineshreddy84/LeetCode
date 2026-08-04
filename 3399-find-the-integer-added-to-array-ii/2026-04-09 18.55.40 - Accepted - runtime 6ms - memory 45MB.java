class Solution {
    int n,m;
    public int minimumAddedInteger(int[] nums1, int[] nums2) {
        m=nums1.length;
        n=nums2.length;
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int min=Integer.MAX_VALUE;
        for(int i=0;i<Math.min(3,m);i++){
            int x=nums2[0]-nums1[i];
            if(check(nums1,nums2,x)){
                min=Math.min(min,x);
            }
        }
        return min;
    }
    public boolean check(int nums1[],int nums2[],int x){
        int c=0,j=0;
        for(int i=0;i<m&&j<n;i++){
            if(nums1[i]+x!=nums2[j]){
                c++;
            }
            else{
                j++;
            }
        }
        return c<=2;
    }
}