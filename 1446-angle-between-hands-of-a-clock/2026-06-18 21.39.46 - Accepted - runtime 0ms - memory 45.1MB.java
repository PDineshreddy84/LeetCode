class Solution {
    public double angleClock(int h, int m) {
        double a=Math.abs(30*h-5.5*m);
        if(a>180){
            return 360-a;
        }
        return a;
    }
}