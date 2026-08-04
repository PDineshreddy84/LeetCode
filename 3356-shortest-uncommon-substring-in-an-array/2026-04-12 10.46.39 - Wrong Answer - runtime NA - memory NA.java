class Solution {
    public String[] shortestSubstrings(String[] arr) {
        Map<String,Integer>m=new TreeMap<>();
        for(String s:arr){
            int n=s.length();
            for(int i=0;i<n;i++){
                String t="";
                for(int j=i;j<n;j++){
                    t+=s.charAt(j);
                    m.put(t,m.getOrDefault(t,0)+1);
                }
            }
        }
        String res[]=new String[arr.length];
        int k=0;
        for(String s:arr){
            int n=s.length();
            String temp="";
            for(int i=0;i<n;i++){
                String t="";
                for(int j=i;j<n;j++){
                    t+=s.charAt(j);
                    if(m.get(t)==1 && (temp=="" || t.compareTo(temp)<0)){
                        temp=t;
                    }
                }
            }
            res[k++]=temp;
        }
        return res;
    }
}