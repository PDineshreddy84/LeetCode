class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        Map<Character,Integer>map=new HashMap<>();
        int n=ransomNote.length();
        int m=magazine.length();
        for(int i=0;i<m;i++){
            map.put(magazine.charAt(i),map.getOrDefault(magazine.charAt(i),0)+1);
        }
        for(int i=0;i<n;i++){
            if(!map.containsKey(ransomNote.charAt(i))){
                return false;
            }
            else{
                map.put(ransomNote.charAt(i),map.get(ransomNote.charAt(i))-1);
                if(map.get(ransomNote.charAt(i))==0){
                    map.remove(ransomNote.charAt(i));
                }
            }
        }
        return true;
    }
}