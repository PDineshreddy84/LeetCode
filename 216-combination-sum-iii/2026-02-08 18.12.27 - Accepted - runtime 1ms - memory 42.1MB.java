class Solution {
    List<List<Integer>>res;
    public List<List<Integer>> combinationSum3(int k, int n) {
        res=new ArrayList<>();
        func(k,n,new ArrayList<>(),1);
        return res;
    }
    public void func(int k,int n,List<Integer>l,int ind){
        if(l.size()==k){
            if(n==0){
                res.add(new ArrayList<>(l));
                return;
            }
        }
        for(int i=ind;i<=9;i++){
            if(i>n || l.size()>k)break;
            l.add(i);
            func(k,n-i,l,i+1);
            l.remove(l.size()-1);
        }
    }
}