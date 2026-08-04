class Solution {
    public String generateTag(String caption) {
        caption=caption.toLowerCase().replaceAll("\\s+"," ");
        StringBuilder res=new StringBuilder();
        res.append("#");
        char ca=caption.charAt(0);
        if(caption.length()>0 && ((ca>='A' && ca<='Z')){
        res.append(Character.toLowerCase(caption.charAt(0)));
        }
        for(int i=1;i<caption.length();i++){
           char ch=caption.charAt(i);
            if(ch==' ' && i+1<caption.length()){
                char c1=caption.charAt(i+1);
                if((c1>='A' && c1<='Z') || c1>='a' && c1<='z')
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