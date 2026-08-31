class Solution {
    public boolean validateStackSequences(int[] pushed, int[] popped) {
        Stack<Integer>st=new Stack<>();
        int i=0,j=0;
        int n=pushed.length;
        while(i<n){
            while(i<n && pushed[i]!=popped[j]){
                st.push(pushed[i]);
                i++;
            }
            i++;
            j++;
            while(!st.isEmpty() && st.peek()==popped[j]){
                st.pop();
                j++;
            }
        }
        return j==n;
    }
}