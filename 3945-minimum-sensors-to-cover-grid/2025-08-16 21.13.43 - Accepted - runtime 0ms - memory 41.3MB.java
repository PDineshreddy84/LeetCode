class Solution {
    public int minSensors(int n, int m, int k) {
        int bs=2*k+1;
        int r=(n+bs-1)/bs;
        int c=(m+bs-1)/bs;
        return r*c;
    }
}