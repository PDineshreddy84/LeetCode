class Solution {
    public long subArrayRanges(int[] nums) {
        int n=nums.length;
        int nse[]=new int[n];
        int pse[]=new int[n];
        int nge[]=new int[n];
        int pge[]=new int[n];
        solve(nums,nse,nge,pse,pge,n);
        long sum1=0,sum2=0;
        for(int i=0;i<n;i++){
            int l1=i-pge[i];
            int l2=i-pse[i];
            int r1=nge[i]-i;
            int r2=nse[i]-i;
            long freq1=1L*l1*r1;
            long freq2=1L*l2*r2;
            sum1+=freq1*nums[i];
            sum2+=freq2*nums[i];
        }
        return sum1-sum2;
    }
    void solve(int nums[],int nse[],int nge[],int pse[],int pge[],int n){
        Stack<Integer>st1=new Stack<>();
        Stack<Integer>st2=new Stack<>();
        Stack<Integer>st3=new Stack<>();
        Stack<Integer>st4=new Stack<>();
        for(int i=n-1;i>=0;i--){
            while(!st1.isEmpty() && nums[st1.peek()]>=nums[i]){
                st1.pop();
            }
            while(!st2.isEmpty() && nums[st2.peek()]<=nums[i]){
                st2.pop();
            }
            nse[i]=!st1.isEmpty()?st1.peek():n;
            nge[i]=!st2.isEmpty()?st2.peek():n;
            st1.push(i);
            st2.push(i);
        }
        for(int i=0;i<n;i++){
            while(!st3.isEmpty() && nums[st3.peek()]>nums[i]){
                st3.pop();
            }
            while(!st4.isEmpty() && nums[st4.peek()]<nums[i]){
                st4.pop();
            }
            pse[i]=!st3.isEmpty()?st3.peek():-1;
            pge[i]=!st4.isEmpty()?st4.peek():-1;
            st3.push(i);
            st4.push(i);
        }
    }
}