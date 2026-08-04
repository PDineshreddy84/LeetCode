class Solution {
    static Map<Character,String>m;
    static List<String>res;
    static int n;
    static{
        m=new HashMap<>();
        m.put('2',"abc");
        m.put('3',"def");
        m.put('4',"ghi");
        m.put('5',"jkl");
        m.put('6',"mno");
        m.put('7',"pqrs");
        m.put('8',"tuv");
        m.put('9',"wxyz");
    }
    public List<String> letterCombinations(String digits) {
        n=digits.length();
       res=new ArrayList<>();
       StringBuilder sb=new StringBuilder();
       func(digits,0,sb);
       return res;
    }
    static public void func(String digits,int ind,StringBuilder sb){
        if(sb.length()==n){
            res.add(sb.toString());
            return;
        }
        for(int i=ind;i<n;i++){
            char ch=digits.charAt(i);
            int len=m.get(ch).length();
            for(int j=0;j<len;j++){
                sb.append(m.get(ch).charAt(j));
                func(digits,i+1,sb);
                sb.deleteCharAt(sb.length()-1);
            }
        }
    }
}