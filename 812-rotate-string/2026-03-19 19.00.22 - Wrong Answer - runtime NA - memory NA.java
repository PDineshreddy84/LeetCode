class Solution {
    public boolean rotateString(String s, String goal) {
        String ds=s+s;
        return ds.contains(goal);
    }
}