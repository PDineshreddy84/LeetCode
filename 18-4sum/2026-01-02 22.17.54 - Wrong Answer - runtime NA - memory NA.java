class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>>res=new ArrayList<>();
        int n=nums.length;
        Arrays.sort(nums);
        long sum=0;
        for(int i=0;i<n-3;i++){
            if(i>0 && nums[i]==nums[i-1]){
                continue;
            }
            for(int j=i+1;j<n-2;j++){
                int k=j+1;
                int l=n-1;
                while(k<l){
                    sum=nums[i]+nums[j];
                    sum+=nums[k];
                    sum+=nums[l];
                    if(sum<target){
                        k++;
                    }
                    else if(sum>target){
                        l--;
                    }
                    else{
                        res.add(Arrays.asList(nums[i],nums[j],nums[k],nums[l]));
                        k++;
                        l--;
                        while(k<l && nums[k]==nums[k-1]){
                            k++;
                        }
                        while(k<l && nums[l]==nums[l+1]){
                            l--;
                        }
                    }
                    while(j<n-2&&nums[j]==nums[j-1]){
                        j++;
                    } 
                }
            }
        }
        return res;
    }
}