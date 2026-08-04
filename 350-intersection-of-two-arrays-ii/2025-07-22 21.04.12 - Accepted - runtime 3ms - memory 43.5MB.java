class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        List<Integer>l=new ArrayList<>();
          Arrays.sort(nums1);
          Arrays.sort(nums2);
          int i=0,j=0,k=0;
          while(i<nums1.length && j<nums2.length){
            if(nums1[i]<nums2[j]){
                i++;
            }
            else if(nums1[i]>nums2[j]){
                j++;
            }
            else{
                l.add(nums1[i]);
                i++;
                j++;
            }
          }
          int res[]=new int[l.size()];
          while(k<l.size()){
            res[k]=l.get(k);
            k++;
          }
          return res;
    }
}