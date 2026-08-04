class Solution {
    public boolean squareIsWhite(String c) {
        int x=(int)(c.charAt(0)-'a');
        int n=Integer.parseInt(c.charAt(1)+"");
        return (x+n)%2==0;
    }
}