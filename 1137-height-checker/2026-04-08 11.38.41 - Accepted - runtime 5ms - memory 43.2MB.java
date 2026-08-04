class Solution {
    public int heightChecker(int[] heights) {
        int arr[]=heights.clone();
        int n=heights.length;
        Arrays.sort(arr);
        int c=0;
        for(int i=0;i<n;i++){
            if(heights[i]!=arr[i]){
                c++;
            }
        }
        return c;
    }
}