class Solution {
    public int maxCoins(int[] nums) {
        List<Integer> l=new ArrayList<>();
        Map<List<Integer>,Integer> mp=new HashMap<>();
        for(int i:nums)l.add(i);
        return helper(l,mp);
    }
    int helper(List<Integer> list,Map<List<Integer>,Integer> mp){
        if(list.size()==1)return list.get(0);
        int max=Integer.MIN_VALUE,n=list.size();
        if(mp.containsKey(list))return mp.get(list);
        for(int i=0;i<n;i++){
            int prod=list.get(i);
            if(i-1>=0)prod*=list.get(i-1);
            if(i+1<n)prod*=list.get(i+1);

            int ele=list.remove(i);
            int x=helper(list,mp);
            list.add(i,ele);
            max=Math.max(max,x+prod);
        }
        mp.put(new ArrayList<>(list),max);
        return max;
    }
}