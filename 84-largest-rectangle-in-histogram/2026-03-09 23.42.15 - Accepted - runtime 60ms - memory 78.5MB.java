class Solution {
    public int largestRectangleArea(int[] heights) {
        Stack<Integer>st=new Stack<>();
        st.push(0);
        int n=heights.length;
        int i=1,max=0;
        for(i=1;i<=n;i++){
            while(!st.isEmpty() && (i==n || heights[i]<heights[st.peek()])){
                max=getMax(heights,st,max,i);
            }
            st.push(i);
        }
        return max;
    }
    public int getMax(int arr[] ,Stack<Integer>st,int max,int i){
        int popped=st.pop();
        int area;
        if(st.isEmpty()){
            area=arr[popped]*(i);
        }
        else{
            area=arr[popped]*(i-1-st.peek());
        }
        return Math.max(area,max);
    }
}