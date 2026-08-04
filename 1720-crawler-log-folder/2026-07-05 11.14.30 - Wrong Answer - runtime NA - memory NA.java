class Solution {
    public int minOperations(String[] logs) {
        int c=0;
        for(String str:logs){
            if(str.equals("../")){
                c--;
            }
            else if(str.equals("./")){

            }
            else{
                c++;
            }
        }
        return c<=0?0:c;
    }
}