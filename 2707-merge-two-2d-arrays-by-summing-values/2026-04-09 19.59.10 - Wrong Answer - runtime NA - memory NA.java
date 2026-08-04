class Solution {
    public int[][] mergeArrays(int[][] nums1, int[][] nums2) {
        List<List<Integer>>l=new ArrayList<>();
        int m=nums1.length,n=nums2.length;
        int i=0,j=0;
        while(i<m && j<n){
            int fi1=nums1[i][0];
            int fi2=nums1[i][1];
            int si1=nums2[i][0];
            int si2=nums2[i][1];
            if(fi1==si1){
                l.add(Arrays.asList(fi1,fi2+si2));
            }
            else{
                if(fi1<si1){
                    l.add(Arrays.asList(fi1,fi2));
                    l.add(Arrays.asList(si1,si2));
                }
                else{
                    l.add(Arrays.asList(si1,si2));
                    l.add(Arrays.asList(fi1,fi2));
                }
            }
            i++;
            j++;
        }
        while(i<m){
            int fi1=nums1[i][0];
            int fi2=nums1[i][1];
            l.add(Arrays.asList(fi1,fi2));
            i++;
        }
        while(j<n){
            int si1=nums2[i][0];
            int si2=nums2[i][1];
            l.add(Arrays.asList(si1,si2));
            j++;
        }
        int res[][]=new int[l.size()][2];
        for(int k=0;k<l.size();k++){
            res[k][0]=l.get(k).get(0);
            res[k][1]=l.get(k).get(1);
        }
        return res;
    }
}