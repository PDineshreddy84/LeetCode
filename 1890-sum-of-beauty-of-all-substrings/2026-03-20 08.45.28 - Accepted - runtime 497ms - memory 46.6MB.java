class Solution {
    public int beautySum(String s) {
        int n=s.length();
        int sum=0;
        for(int i=0;i<n;i++){
            Map<Character,Integer>m=new HashMap<>();
            for(int j=i;j<n;j++){
                m.put(s.charAt(j),m.getOrDefault(s.charAt(j),0)+1);
                int maxi=Integer.MIN_VALUE;
                int mini=Integer.MAX_VALUE;
                for(int val:m.values()){
                    mini=Math.min(mini,val);
                    maxi=Math.max(maxi,val);
                }
                sum+=(maxi-mini);
            }
        }
        return sum;
    }
}