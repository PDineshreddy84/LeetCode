class Solution {
    public int[] bestTower(int[][] towers, int[] center, int radius) {
        Arrays.sort(towers, new Comparator<int[]>() {
            public int compare(int[] arr1, int[] arr2) {
                if (arr1[2] != arr2[2]) {
                    return Integer.compare(arr2[2], arr1[2]); 
                }
                if(arr1[0]!=arr2[0]){
                    return Integer.compare(arr1[0], arr2[0]);
                }
                    return Integer.compare(arr1[1], arr2[1]);
            }
        });
        for(int i=0;i<towers.length;i++){
                boolean ans=solve(center,towers[i][0],towers[i][1],radius);
            if(ans){
                return new int[]{towers[i][0],towers[i][1]};
            }
        }
        return new int[]{-1,-1};
    }
    public  boolean solve(int c[],int x,int y,int r){
        return (Math.abs(c[0]-x)+Math.abs(c[1]-y))<=r;
    }
}