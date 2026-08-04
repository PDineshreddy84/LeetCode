class Solution {
    public int[][] spiralMatrixIII(int rows, int cols, int rStart, int cStart) {
        int k=1,ind=0;
        int res[][]=new int[rows*cols][2];
        int i=rStart,j=cStart;
        while(ind<rows*cols){
            ind=func(res,rows,cols,i,j,k,ind);
            i--;
            j--;
            k+=2;
        }
        return res;
    }
    int func(int res[][],int r,int c,int cr,int cc,int k,int ind){
        // System.out.println(cr+" "+cc+" "+ind);
        int j=cc,i=cr;
        for(j=cc;j<cc+k;j++){
            if(j>=0&&i>=0&&j<c&&i<r){
                res[ind][0]=i;
                res[ind++][1]=j;
        //  System.out.println(i+" "+j);
            }
        }
        for(i=cr;i<cr+k;i++){
            if(j>=0&&i>=0&&j<c&&i<r){
                res[ind][0]=i;
                res[ind++][1]=j;
         System.out.println(i+" "+j);
            }
        }
            // System.out.println(ind+" ");
        while(j>=cc){
            if(j>=0&&i>=0&&j<c&&i<r){
                res[ind][0]=i;
                res[ind++][1]=j;
        //  System.out.println(i+" "+j);
            }
            j--;
        }
        while(i>=cr){
            if(j>=0&&i>=0&&j<c&&i<r){
                res[ind][0]=i;
                res[ind++][1]=j;
        //  System.out.println(i+" "+j);
            }
            i--;
        }
        //  System.out.println(res[0][0]+" "+res[0][1]);
        // System.out.println(res[1][0]+" "+res[1][1]);
        // System.out.println(res[2][0]+" "+res[2][1]);
        // System.out.println(res[3][0]+" "+res[3][1]);
        return ind;
    }
}