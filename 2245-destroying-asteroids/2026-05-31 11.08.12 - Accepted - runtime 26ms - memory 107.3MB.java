class Solution {
    public boolean asteroidsDestroyed(int mass, int[] asteroids) {
        long sum=mass;
        int n=asteroids.length;
        Arrays.sort(asteroids);
        for(int i=0;i<n;i++){
            if(sum>=asteroids[i]){
                sum+=asteroids[i];
            }
            else{
                return false;
            }
        }
        return true;
    }
}