class Solution {
    public List<Integer> findDisappearedNumbers(int[] arr) {
        List<Integer>l=new ArrayList<>();
        int i=0;
        int n=arr.length;
        while(i<n){
            int c=arr[i]-1;
            if(arr[i]!=arr[c]){
                int t=arr[i];
                arr[i]=arr[c];
                arr[c]=t;
            }
            else{
                i++;
            }
        }
        for(int k=0;k<n;k++){
            if(arr[k]!=k+1){
                l.add(k+1);
            }
        }
        return l;
    }
}