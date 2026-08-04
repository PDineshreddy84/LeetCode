import java.math.*;
class Solution {
    public String addStrings(String num1, String num2) {
       BigInteger A=new BigInteger(num1);
       BigInteger B=new BigInteger(num2);
        return A.add(B).toString();
    }
}