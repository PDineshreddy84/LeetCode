class Solution {
    public int[] resultArray(int[] nums) {
        int n=nums.length;
        List<Integer> l1=new ArrayList<>();
        List<Integer> l2=new ArrayList<>();
        l1.add(nums[0]);
        l2.add(nums[1]);
        for(int i=2;i<n;i++){
            int lt1=l1.get(l1.size()-1);
            int lt2=l2.get(l2.size()-1);
            if(lt1>lt2){
                l1.add(nums[i]);
            }
            else{
                l2.add(nums[i]);
            }
        }
        List<Integer>cl=new ArrayList<>();
        cl.addAll(l1);
        cl.addAll(l2);
        int res[]=new int[n];
        for(int i=0;i<n;i++){
            res[i]=cl.get(i);
        }
        return res;
    }
}