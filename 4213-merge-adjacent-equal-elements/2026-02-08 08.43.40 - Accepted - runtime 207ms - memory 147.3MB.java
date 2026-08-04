class Solution {
    public List<Long> mergeAdjacent(int[] nums) {
        List<Long>l=new ArrayList<>();
        Stack<Long>s=new Stack<>();
        int n=nums.length;
        int i=1;
        s.push((long)nums[0]);
        while(i<n){
           s.push((long)(nums[i]));
            long p1=s.peek();
            long r=s.pop();
            long p2=s.peek();
            s.push(r);
            while(p1==p2){
                s.pop();
                s.pop();
                s.push(p1+p2);
                if(s.size()<2){
                    break;
                }
                p1=s.peek();
                r=s.pop();
                p2=s.peek();
                s.push(r);
            }
            i++;
        }
        for(long ele:s){
            l.add(ele);
        }
        return l;
    }
}