class Solution {
    public int reversePairs(int[] nums) {
        return mergeSort(nums,0,nums.length-1);
    }
    public int mergeSort(int nums[],int low,int high){
        int c=0;
        int mid=(low+high)/2;
        if(low>=high){
            return c;
        }
        c+=mergeSort(nums,low,mid);
        c+=mergeSort(nums,mid+1,high);
        c+=countPairs(nums,low,mid,high);
        merge(nums,low,mid,high);
        return c;
    }
    public int countPairs(int nums[],int low,int mid,int high){
        int c=0;
        int r=mid+1;
        for(int i=low;i<=mid;i++){
            while(r<=high && (long)nums[i]>((long)2*(long)nums[r])){
                r++;
            }
            c+=(r-(mid+1));
        }
        return c;
    }
    public void merge(int nums[],int low,int mid,int high){
        int l=low;
        int r=mid+1;
        List<Integer>res=new ArrayList<>();
        while(l<=mid && r<=high){
            if(nums[l]<=nums[r]){
                res.add(nums[l++]);
            }
            else{
                res.add(nums[r++]);
            }
        }
        while(l<=mid){
            res.add(nums[l++]);
        }
        while(r<=high){
            res.add(nums[r++]);
        }
        for(int i=low;i<=high;i++){
            nums[i]=res.get(i-low);
        }
    }
}