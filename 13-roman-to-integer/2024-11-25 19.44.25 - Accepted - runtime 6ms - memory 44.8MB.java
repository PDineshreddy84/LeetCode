class Solution {
    public int romanToInt(String s) {
        Map<Character,Integer> romanValues=Map.of(
            'I',1,'V',5,'X',10,'L',50,'C',100,'D',500,'M',1000
        );
        int total=0;
        for(int i=0;i<s.length();i++){
            if(i<s.length()-1 && romanValues.get(s.charAt(i))<romanValues.get(s.charAt(i+1)))
            total-=romanValues.get(s.charAt(i));
            else
            total+=romanValues.get(s.charAt(i));
        }
        return total;
    }
}