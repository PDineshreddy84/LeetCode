class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer,Integer>m=new HashMap<>();
        int n=nums.length;
        for(int i=0;i<n;i++){
            m.put(nums[i],m.getOrDefault(nums[i],0)+1);
        }
        List<Map.Entry<Integer,Integer>>list=new ArrayList<>(m.entrySet());
        list.sort((a,b)->Integer.compare(b.getValue(),a.getValue()));
        int ans[]=new int[k];
        int i=0;
        for(Map.Entry<Integer,Integer>e:list){
            if(i==k)break;
            ans[i]=e.getKey();
            i++;
        }
        return ans;
    }
}