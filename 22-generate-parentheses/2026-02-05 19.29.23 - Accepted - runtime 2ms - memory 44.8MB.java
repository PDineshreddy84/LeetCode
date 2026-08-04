class Solution {
    public List<String> generateParenthesis(int n) {
        List<String>l=new ArrayList<>();
        solve(l,0,0,n,"");
        return l;
    }
    public void solve(List<String>l,int op,int cl,int n,String curr){
        if(op==cl && op==n){
            l.add(curr.toString());
            return;
        }
        if(op<n){
            solve(l,op+1,cl,n,curr+"(");
        }
        if(cl<op){
            solve(l,op,cl+1,n,curr+")");
        }
    }
}