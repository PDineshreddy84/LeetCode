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
        // int c=0;
        // int n1=a.length,n2=b.length;
        // int n=n1+n2;
        // int i=0,j=0;
        // int ind2=n/2;
        // int ind1=ind2-1;
        // int ind1ele=-1,ind2ele=-1;
        // while(i<n1 && j<n2){
        //     if(a[i]<b[j]){
        //         if(c==ind1){
        //             ind1ele=a[i];
        //         }
        //         if(c==ind2){
        //             ind2ele=a[i];
        //         }
        //         c++;
        //         i++;
        //     }
        //     else{
        //         if(c==ind1){
        //             ind1ele=b[j];
        //         }
        //         if(c==ind2){
        //             ind2ele=b[j];
        //         }
        //         c++;
        //         j++;
        //     }
        // }
        // while(i<n1){
        //     if(c==ind1){
        //             ind1ele=a[i];
        //         }
        //         if(c==ind2){
        //             ind2ele=a[i];
        //         }
        //         c++;
        //         i++;
        // }
        // while(j<n2){
        //      if(c==ind1){
        //             ind1ele=b[j];
        //         }
        //         if(c==ind2){
        //             ind2ele=b[j];
        //         }
        //         c++;
        //         j++;
        // }
        // if(n%2==1){
        //     return ind2ele;
        // }
        // return (double)((double)(ind1ele+ind2ele))/2.0;
        int n1=a.length,n2=b.length;
        if(n1>n2){
            return findMedianSortedArrays(b,a);
        }
        int n=n1+n2;
        int left=(n1+n2+1)/2;
        int l=0,r=n1;
        while(l<=r){
            int m1=l+((r-l)/2);
            int m2=left-m1;
            int l1=Integer.MIN_VALUE;
            int l2=Integer.MIN_VALUE;
            int r1=Integer.MAX_VALUE;
            int r2=Integer.MAX_VALUE;
            if(m1<n1){
                r1=a[m1];
            }
            if(m2<n2){
                r2=b[m2];
            }
            if(m1-1>=0){
                l1=a[m1-1];
            }
            if(m2-1>=0){
                l2=b[m2-1];
            }
            if(l1<=r2 && l2<=r1){
                if(n%2==1){
                    return Math.max(l1,l2);
                }
                return ((double)(Math.max(l1,l2)+(double)Math.min(r1,r2)))/2.0;
            }
            else if(l1>r2){
                r=m1-1;
            }
            else{
                l=m1+1;
            }
        }
        return 0;
    }
}