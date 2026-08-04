class Solution {
    public String reformatDate(String date) {
        String mon[]={"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};
      String arr[]= date.split(" ");
      String year=arr[2];
     int month=0;
      for(int i=0;i<12;i++){
       if(arr[1].equals(mon[i])){
        month=i+1;
        break;
       }
      }
      String day=arr[0].replaceAll("\\D","");
      String monthFormated=String.format("%02d",month);
      String dayFormated=String.format("%02d",Integer.parseInt(day));
    return year+"-"+monthFormated+"-"+dayFormated;
    }
}