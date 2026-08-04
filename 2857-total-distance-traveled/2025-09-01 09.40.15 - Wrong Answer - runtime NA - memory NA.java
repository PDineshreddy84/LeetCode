class Solution {
    public int distanceTraveled(int mainTank, int additionalTank) {
        int max=0;
        if(mainTank<5){
            return mainTank*10;
        }
        while(mainTank>=5){
            if(additionalTank>0){
                mainTank++;
            }
            max+=50;
            mainTank-=5;
        }
        return max+mainTank*10;
    }
}