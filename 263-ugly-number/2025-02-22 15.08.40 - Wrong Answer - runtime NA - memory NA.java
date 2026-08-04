class Solution {
    public boolean isUgly(int n) {
        String a235="235";
        for(int i=2;i<n;i++){
            if(n%i==0&&!a235.contains(i+""))return false;
        }
        return true;
    }
}