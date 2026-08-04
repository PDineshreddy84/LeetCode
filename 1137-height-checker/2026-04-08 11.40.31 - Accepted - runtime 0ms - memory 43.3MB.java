class Solution {
    public int heightChecker(int[] heights) {
        int n=heights.length;
        int a[]=new int[101];
        for(int i=0;i<n;i++){
            a[heights[i]]++;
        }
      
            int idx=0;
            int count=0;
            for(int i=1;i<=100;i++){
                while(a[i]>0){
                    if(heights[idx]!=i){
                        count++;
                    }
                    idx++;
                    a[i]--;
                }
            }  
            return count;      
    }
}