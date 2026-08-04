class Solution {
    public int minOperations(String[] logs) {
        int c=0;
        for(String str:logs){
            if(str.equals("../")){
                c--;
                if(c<0)c=0;
            }
            else if(str.equals("./")){

            }
            else{
                c++;
            }
        }
        return c;
    }
}