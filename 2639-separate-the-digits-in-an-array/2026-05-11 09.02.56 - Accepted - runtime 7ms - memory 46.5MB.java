class Solution {
    public int[] separateDigits(int[] nums) {
        List<Integer>l=new ArrayList<>();
        for(int num:nums){
            String s=num+"";
            for(int i=0;i<s.length();i++){
                l.add(s.charAt(i)-'0');
            }
        }
        int ans[]=new int[l.size()];
        for(int i=0;i<l.size();i++){
            ans[i]=l.get(i);
        }
        return ans;
    }
}