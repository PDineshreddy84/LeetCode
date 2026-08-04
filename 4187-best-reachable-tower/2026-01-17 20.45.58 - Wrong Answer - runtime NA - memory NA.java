class Solution {
    public int[] bestTower(int[][] towers, int[] center, int radius) {
        Arrays.sort(towers, new Comparator<int[]>() {
            public int compare(int[] arr1, int[] arr2) {
                if (arr1[2] != arr2[2]) {
                    return Integer.compare(arr2[2], arr1[2]); 
                }
                else{
                    return 0;
                }
            }
        });
        // for(int i=0;i<towers.length;i++){
        //     for(int j=0;j<towers[0].length;j++){
        //         System.out.print(towers[i][j]);
        //     }
        //     System.out.println();
        // }
        // Map<Integer,Pair>m=new TreeMap<>();
        // for(int i=0;i<towers.length;i++){
        //     m.put(i,new Pair(towers[i][0],towers[i][1],towers[i][2]));
        // }
        for(int i=0;i<towers.length;i++){
                boolean ans=solve(center,towers[i][0],towers[i][1],radius);
            if(ans){
                return new int[]{towers[i][0],towers[i][1]};
            }
        }
        return new int[]{-1,-1};
    }
    public  boolean solve(int c[],int x,int y,int r){
        return (Math.abs(c[0]-x)+Math.abs(c[1]-y))>r?false:true;
    }
}
// class Pair{
//     int x,y,q;
//     Pair(int index,int x,int y,int q){
//         this.index=index;
//         this.x=x;
//         this.y=y;
//         this.q=q;
//     }
// }