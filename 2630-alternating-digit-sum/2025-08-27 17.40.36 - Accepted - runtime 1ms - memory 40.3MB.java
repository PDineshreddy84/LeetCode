class Solution {
    public int alternateDigitSum(int num) {
        String n=num+"";
        int sum=0;
        for(int i=0;i<n.length();i++){
            int v=Integer.parseInt(n.charAt(i)+"");
            if(i%2==0){
                sum+=v;
            }
            else{
                sum-=v;
            }
        }
        return sum;
    }
}