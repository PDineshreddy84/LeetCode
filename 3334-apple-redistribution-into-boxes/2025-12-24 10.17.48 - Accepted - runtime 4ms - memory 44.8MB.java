class Solution {
    public int minimumBoxes(int[] apple, int[] cap) {
        int t=0;
        for(int num:apple){
            t+=num;
        }
        int req=1;
        Arrays.sort(cap);
        reverseArray(cap);
        for(int num:cap){
            t-=num;
            if(t>0){
                req++;
            }
            else{
                break;
            }
        }
        return req;
    }
    public static void reverseArray(int cap[]){
        int n=cap.length;
        int temp=0;
        for(int i=0;i<n/2;i++){
            temp=cap[i];
            cap[i]=cap[n-i-1];
            cap[n-i-1]=temp;
        }
    }
}