class Solution {
    public List<List<String>> partition(String s) {
        int n=s.length();
        List<List<String>>res=new ArrayList<>();
        List<String>path=new ArrayList<>();
        solve(res,path,s,n,0);
        return res;
    }
    public void solve(List<List<String>>res,List<String>path,String s,int n,int ind){
        if(ind==n){
            res.add(new ArrayList<>(path));
            return;
        }
        for(int i=ind;i<n;i++){
            if(isPalindrome(s,ind,i)){
                path.add(s.substring(ind,i+1));
                solve(res,path,s,n,i+1);
                path.remove(path.size()-1);
            }
        }
    }
    public boolean isPalindrome(String s,int l,int r){
        while(l<r){
            if(s.charAt(l)!=s.charAt(r))return false;
            l++;
            r--;
        }
        return true;
    }
}