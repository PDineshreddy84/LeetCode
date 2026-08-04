class Solution {
    public String generateTag(String caption) {
        caption=caption.toLowerCase().trim();
        StringBuilder res=new StringBuilder();
        res.append("#");
        if(caption.length()>0){
        res.append(Character.toLowerCase(caption.charAt(0)));
        }
        for(int i=1;i<caption.length();i++){
           char ch=caption.charAt(i);
            if(ch==' ' && i+1<caption.length()){
                char c1=caption.charAt(i+1);
              res.append(Character.toUpperCase(c1));
                i++;
            }
            else if((ch>='A' && ch<='Z') || ch>='a' && ch<='z'){
                res.append(ch);
            }
            if(res.length()==100){
                break;
            }
        }
        return res.toString();
    }
}