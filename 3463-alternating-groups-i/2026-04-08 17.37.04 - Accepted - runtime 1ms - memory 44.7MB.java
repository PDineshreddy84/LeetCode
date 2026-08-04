class Solution {
    public int numberOfAlternatingGroups(int[] colors) {
        int c=1;
        int n=colors.length;
        int res=0;
        for(int i=1;i<n+2;i++){
            if(colors[i%n]==colors[(i-1)%n]){
                c=1;
                continue;
            }
            else{
                c++;
            }
            if(c==3){
                res++;
                c--;
            }
        }
        return res;
    }
}

