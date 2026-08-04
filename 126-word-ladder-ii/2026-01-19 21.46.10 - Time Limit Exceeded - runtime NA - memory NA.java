class Solution {
    public List<List<String>> findLadders(String beginWord, String endWord, List<String> wordList) {
        Set<String>word=new HashSet<>(wordList);
        List<List<String>>res=new ArrayList<>();
        if(!(word.contains(endWord))){
            return res;
        }
        Queue<List<String>>q=new LinkedList<>();
        List<String>ls=new ArrayList<>();
        ls.add(beginWord);
        q.add(ls);
        boolean found=false;
        while(!q.isEmpty() && !found){
            int n=q.size();
            Set<String>usedThisLevel=new HashSet<>();
            while(n-->0){
                List<String>path=q.remove();
                String s=path.get(path.size()-1);
                char[] temp=s.toCharArray();
                for(int i=0;i<temp.length;i++){
                    char orginal=temp[i];
                    for(char ch='a';ch<='z';ch++){
                        temp[i]=ch;
                        String str=new String(temp);
                        if(!word.contains(str))continue;
                        List<String>newPath=new ArrayList<>(path);
                        newPath.add(str);
                        if(str.equals(endWord)){
                            res.add(newPath);
                            found=true;
                        }
                        else{
                            q.add(newPath);
                        }
                        usedThisLevel.add(str);
                    }
                        temp[i]=orginal;
                }
            }
                word.removeAll(usedThisLevel);
        }
        return res;
    }
}