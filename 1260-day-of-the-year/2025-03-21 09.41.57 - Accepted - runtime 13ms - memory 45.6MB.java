class Solution {
    public int dayOfYear(String date) {
        String year=date.split("-")[0];
        int month=Integer.parseInt(date.split("-")[1]);
        int day=Integer.parseInt(date.split("-")[2]);
        int daysInMonths[]={31,28,31,30,31,30,31,31,30,31,30,31};
        if(isLeap(Integer.parseInt(year))){
            daysInMonths[1]=29;
        }
        int sum=day;
        for(int i=0;i<month-1;i++){
            sum+=daysInMonths[i];
        }
        return sum;
    }
    public static boolean isLeap(int n){
        if(n%100==0){
           return n%400==0;
        }
        else{
                return n%4==0;
            }
    }
}