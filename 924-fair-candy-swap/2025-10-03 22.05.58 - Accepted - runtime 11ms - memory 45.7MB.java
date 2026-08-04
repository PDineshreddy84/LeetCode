class Solution {
    public int[] fairCandySwap(int[] aliceSizes, int[] bobSizes) {
        int asum=0,bsum=0;
        Arrays.sort(bobSizes);
        for(int i:aliceSizes){
            asum+=i;
        }
        for(int i:bobSizes){
            bsum+=i;
        }
        int half=(bsum-asum)/2;
        for(int i:aliceSizes){
            int temp=findIndex(bobSizes,half+i);
            if(temp!=-1){
                return new int[]{i,bobSizes[temp]};
            }
        }
        return new int[]{0,0};
    }
    public static int findIndex(int bobSizes[],int target){
        int l=0,r=bobSizes.length-1;
        while(l<=r){
            int m=l+(r-l)/2;
            if(bobSizes[m]==target){
                return m;
            }
            else if(target < bobSizes[m]){
                r=m-1;
            }
            else{
                l=m+1;
            }
        }
        return -1;
    }
}