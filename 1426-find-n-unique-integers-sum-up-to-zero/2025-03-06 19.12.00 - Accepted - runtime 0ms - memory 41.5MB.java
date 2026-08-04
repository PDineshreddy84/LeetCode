class Solution {
    public int[] sumZero(int n) {
        int arr[]=new int[n];
        int t=-1;
            if(n%2!=0){
                t=0;
            }
            for(int i=0;i<n/2;i++){
                arr[i]=i+1;
            }
            for(int i=n/2;i<n;i++){
                arr[i]=t;
                t--;
            
            }
            return arr;
        }
    }
