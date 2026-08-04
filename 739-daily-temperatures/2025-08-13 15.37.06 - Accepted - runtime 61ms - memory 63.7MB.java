class Solution {
    public int[] dailyTemperatures(int[] tem) {
        Stack<Integer>st=new Stack<>();
        int n=tem.length;
        int ans[]=new int[n];
        for(int i=0;i<n;i++){
            while(st.size()>0 && tem[i]>tem[st.peek()]){
                ans[st.pop()]=i;
            }
            st.push(i);
        }
        for(int i=0;i<n;i++){
            ans[i]-=i;
            if(ans[i]<0)ans[i]=0;
        }
        return ans;
    }
}