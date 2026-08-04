class Solution {
    public boolean asteroidsDestroyed(int mass, int[] asteroids) {
        long sum=0;
        int n=asteroids.length;
        Arrays.sort(asteroids);
        for(int i=0;i<n;i++){
            if(mass>=asteroids[i]){
                mass+=asteroids[i];
            }
            else{
                return false;
            }
        }
        return true;
    }
}