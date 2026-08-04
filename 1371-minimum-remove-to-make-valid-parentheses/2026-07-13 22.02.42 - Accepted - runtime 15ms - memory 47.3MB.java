class Solution {
    public String minRemoveToMakeValid(String s) {
     Set<Integer>set=new HashSet<>();
     int n=s.length();
     int diff=0;
     for(int i=0;i<n;i++){
        if(s.charAt(i)=='('){
            diff++;
        }
        else if(s.charAt(i)==')'){
            if(diff==0){
                set.add(i);
            }
            else{
                diff--;
            }
        }
     }
     for(int i=n-1;i>=0 && diff>0 ;i--){
        if(s.charAt(i)=='('){
            set.add(i);
            diff--;
        }
     }
     StringBuilder sb=new StringBuilder();
     for(int i=0;i<n;i++){
        if(!set.contains(i)){
            sb.append(s.charAt(i));
        }
     }
     return sb.toString();
    }
}