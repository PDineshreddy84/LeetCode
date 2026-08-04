class Solution {
    public int minSwaps(int[] nums) {
        int n=nums.length;
        int c=0,j=0,t=0;
        int arr[]=new int[n];
        arr=clac(nums,n);
        for(int i=0;i<n-1;i++){
            t=0;
            j=i+1;
            if(arr[i]==arr[i+1] && nums[i]>nums[i+1]){
                t=nums[i];
                nums[i]=nums[i+1];
                nums[i+1]=t;
                c++;
            }
            else{
            while(arr[i]>arr[j]){
                j++;
                if(j==n){
                    break;
                }
            }
            if(j!=(i+1)){
                t=arr[i];
                arr[i]=arr[j-1];
                arr[j-1]=t;
                c++;
                i--;
            }
            }
        }
        return c;
    }
    public static int[] clac(int[] n,int l){
        int na[]=new int[l];
       for(int i=0;i<l;i++){ 
           int r=0,s=0;
           int ele=n[i];
        while(ele!=0){
            r=ele%10;
            s+=r;
            ele/=10;
        }
           na[i]=s;
    }
        return na;
    }
}