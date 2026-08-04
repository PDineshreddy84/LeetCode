class Solution {
    public String countAndSay(int n) {
        String res="1";
        for(int i=1;i<n;i++){
            StringBuilder curr=new StringBuilder();
            int c=1;
            for(int j=1;j<res.length();j++){
                if(res.charAt(j)==res.charAt(j-1)){
                    c++;
                }
                else{
                    curr.append(c).append(res.charAt(j-1));
                    c=1;
                }
            }
            curr.append(c).append(res.charAt(res.length()-1));
            res=curr.toString();
        }
        return res;
    }
}