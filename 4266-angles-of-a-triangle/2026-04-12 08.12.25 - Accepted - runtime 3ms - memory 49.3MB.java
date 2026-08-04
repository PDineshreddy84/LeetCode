class Solution {
    public double[] internalAngles(int[] sides) {
        double a=sides[0];
        double b=sides[1];
        double c=sides[2];
        if(a+b<=c || b+c<=a || a+c<=b){
            return new double[0];
        }
        double A=Math.toDegrees(Math.acos((b*b+c*c-a*a)/(2*b*c)));
        double B=Math.toDegrees(Math.acos((a*a+c*c-b*b)/(2*a*c)));
        double C=180.0-A-B;
        double res[]=new double[]{A,B,C};
        Arrays.sort(res);
        return res;
    }
}