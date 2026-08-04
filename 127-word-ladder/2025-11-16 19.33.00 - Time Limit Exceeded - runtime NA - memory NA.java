class Solution {
    public int ladderLength(String beginWord, String endWord, List<String> wordList) {
        if(!wordList.contains(endWord)){
            return 0;
        }
        Set<String>visited=new HashSet<>();
        Queue<String>q=new LinkedList<>();
        q.add(beginWord);
        int len=0;
        while(!q.isEmpty()){
            int size=q.size();
            len++;
            for(int i=0;i<size;i++){
                String current=q.remove();
                for(int j=0;j<current.length();j++){
                    char temp[]=current.toCharArray();
                    for(char ch='a';ch<='z';ch++){
                        temp[j]=ch;
                        String newWord=new String(temp);
                        if(newWord.equals(endWord)){
                            return len+1;
                        }
                        if(wordList.contains(newWord) && !visited.contains(newWord)){
                            q.add(newWord);
                            visited.add(newWord);
                        }
                    }
                }
            }
        }
        return 0;
    }
}