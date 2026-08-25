class Solution {
    public int maxVowels(String s, int k) {
        String v="aeiou";
        int n=s.length();
        int l=0,r=0,c=0,max=0;
        char arr[]=s.toCharArray();
        while(r<n){
            int len=r-l+1;
            if(v.contains(arr[r]+"")){
                c++;
            }
            if(len>k){
                if(v.contains(arr[l]+"")){
                    c--;
                }
                l++;
            }
            len=r-l+1;
            if(len==k){
                max=Math.max(max,c);
            }
            r++;
        }
        return max;
    }
}