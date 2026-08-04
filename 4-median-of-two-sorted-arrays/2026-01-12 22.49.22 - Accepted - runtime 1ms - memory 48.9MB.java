class Solution {
    public double findMedianSortedArrays(int[] a, int[] b) {
    //     int l=nums1.length+nums2.length;
    //     int arr[]=new int[l];
    //     float ans=0;
    //     int j=0;
    //     for(int i=0;i<l;i++){
    //         if(i<nums1.length){
    //         arr[i]=nums1[i];
    //         }
    //         else{
    //             arr[i]=nums2[j];
    //             j++;
    //         }
    //     }
    //     Arrays.sort(arr);
    //     if(l%2==0){
    //         ans=(float)(arr[l/2]+arr[(l/2)-1])/2;
    //     }
    //     else{
    //         ans=(float)arr[l/2];
    //     }
    //     return ans;
        int c=0;
        int n1=a.length,n2=b.length;
        int n=n1+n2;
        int i=0,j=0;
        int ind2=n/2;
        int ind1=ind2-1;
        int ind1ele=-1,ind2ele=-1;
        while(i<n1 && j<n2){
            if(a[i]<b[j]){
                if(c==ind1){
                    ind1ele=a[i];
                }
                if(c==ind2){
                    ind2ele=a[i];
                }
                c++;
                i++;
            }
            else{
                if(c==ind1){
                    ind1ele=b[j];
                }
                if(c==ind2){
                    ind2ele=b[j];
                }
                c++;
                j++;
            }
        }
        while(i<n1){
            if(c==ind1){
                    ind1ele=a[i];
                }
                if(c==ind2){
                    ind2ele=a[i];
                }
                c++;
                i++;
        }
        while(j<n2){
             if(c==ind1){
                    ind1ele=b[j];
                }
                if(c==ind2){
                    ind2ele=b[j];
                }
                c++;
                j++;
        }
        if(n%2==1){
            return ind2ele;
        }
        return (double)((double)(ind1ele+ind2ele))/2.0;
    }
}