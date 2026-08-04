class Solution {
    static int l=1000009;
    static int prime[]=new int[l];
    static Set<Integer>s=new HashSet<>();
    static{
        prime[0]=1;
        prime[1]=1;
        for(int i=2;i*i<=l;i++){
            if(prime[i]==0){
                for(int j=i*i;j<l;j+=i){
                    prime[j]=1;
                }
            }
        }
        for(int i=0;i<l;i++){
            if(prime[i]==0){
                s.add(i);
            }
        }
    }
    public int minOperations(int[] nums) {
        int n=nums.length;
        int c=0;
        for(int i=0;i<n;i+=2){
            int ele=nums[i];
            while(!s.contains(ele)){
                ele++;
                c++;
            }
        }
        for(int i=1;i<n;i+=2){
            int ele=nums[i];
            while(s.contains(ele)){
                ele++;
                c++;
            }
        }
        return c;
    }
}