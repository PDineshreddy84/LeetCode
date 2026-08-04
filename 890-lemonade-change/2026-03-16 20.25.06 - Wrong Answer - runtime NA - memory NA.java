class Solution {
    public boolean lemonadeChange(int[] bills) {
        int c5=0,c10=0;
        for(int num:bills){
            if(num==5){
                c5++;
            }
            else if(num==10){
                if(c5==0)return false;
                c10++;
                c5--;
            }
            else{
                if((c5==0)||(c10==0 && c5<3))return false;
                c10--;
                c5--;
            }
        }
        return true;
    }
}