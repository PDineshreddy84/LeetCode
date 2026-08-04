class Solution {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        Arrays.sort(arr1);
        int n1=arr1.length;
        int n2=arr2.length;
        int k=0;
        int res[]=new int[n1];
        for(int i=0;i<n2;i++){
            int f=0;
            for(int j=0;j<n1;j++){
                while(arr2[i]==arr1[j]){
                    f=1;
                    res[k]=arr1[j];
                    arr1[j]=-1;
                    k++;
                    j++;
                }
                if(f==1)break;
            }
        }
        for(int i=0;i<n1;i++){
            if(arr1[i]!=-1){
                res[k++]=arr1[i];
            }
        }
        return res;
    }
}