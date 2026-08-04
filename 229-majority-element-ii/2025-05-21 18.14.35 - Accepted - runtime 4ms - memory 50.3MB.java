class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int n=nums.length;
        int e1=-1,e2=-1,c1=0,c2=0;
        for(int i=0;i<n;i++){
            if(nums[i]==e1){
                c1++;
            }
            else if(nums[i]==e2){
                c2++;
            }
            else if(c1==0){
                e1=nums[i];
                c1++;
            }
            else if(c2==0){
                e2=nums[i];
                c2++;
            }
            else{
                c1--;
                c2--;
            }
        }
        c1=0;
        c2=0;
        List<Integer>l=new ArrayList<>();
        for(int i=0;i<n;i++){
            if(e1==nums[i]){
                c1++;
            }
            if(e2==nums[i]){
                c2++;
            }
        }
        if(c1>n/3){
            l.add(e1);
        }
        if(c2>n/3 && e1!=e2){
            l.add(e2);
        }
        Collections.sort(l);
        return l;
    }
}