class Solution {
    public int sumSubarrayMins(int[] arr) {
        int n=arr.length,sum=0;
        int nse[]=new int[n];
        int pse[]=new int[n];
        int m=(int)(1e9+7);
        findNse(nse,arr,n);
        findPse(pse,arr,n);
        for(int i=0;i<n;i++){
            int left=i-pse[i];
            int right=nse[i]-i;
            long freq=left*right*1L;
            int val=(int)((freq*arr[i])%m);
            sum=(sum+val)%m;
        }
        return sum;
    }
    void findNse(int nse[],int arr[],int n){
        Stack<Integer>st=new Stack<>();
        for(int i=n-1;i>=0;i--){
            while(!st.isEmpty() && arr[st.peek()]>=arr[i]){
                st.pop();
            }
            nse[i]=!st.isEmpty()?st.peek():n;
            st.push(i);
        }
    }
    void findPse(int pse[],int arr[],int n){
        Stack<Integer>st=new Stack<>();
        for(int i=0;i<n;i++){
            while(!st.isEmpty() && arr[st.peek()]>arr[i]){
                st.pop();
            }
            pse[i]=!st.isEmpty()?st.peek():-1;
            st.push(i);
        }
    }
}