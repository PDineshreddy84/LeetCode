class Solution {
        List<List<String>>res=new ArrayList<>();
    public List<List<String>> findLadders(String beginWord, String endWord, List<String> wordList) {
        // Set<String>word=new HashSet<>(wordList);
        // List<List<String>>res=new ArrayList<>();
        // if(!(word.contains(endWord))){
        //     return res;
        // }
        // Queue<List<String>>q=new LinkedList<>();
        // List<String>ls=new ArrayList<>();
        // ls.add(beginWord);
        // q.add(ls);
        // boolean found=false;
        // while(!q.isEmpty() && !found){
        //     int n=q.size();
        //     Set<String>usedThisLevel=new HashSet<>();
        //     while(n-->0){
        //         List<String>path=q.poll();
        //         String s=path.get(path.size()-1);
        //         char[] temp=s.toCharArray();
        //         for(int i=0;i<temp.length;i++){
        //             char orginal=temp[i];
        //             for(char ch='a';ch<='z';ch++){
        //                 temp[i]=ch;
        //                 String str=new String(temp);
        //                 if(!word.contains(str))continue;
        //                 List<String>newPath=new ArrayList<>(path);
        //                 newPath.add(str);
        //                 if(str.equals(endWord)){
        //                     res.add(newPath);
        //                     found=true;
        //                 }
        //                 else{
        //                     q.add(newPath);
        //                 }
        //                 usedThisLevel.add(str);
        //             }
        //                 temp[i]=orginal;
        //         }
        //     }
        //         word.removeAll(usedThisLevel);
        // }
        // return res;
        Set<String>words=new HashSet<>(wordList);
        if(!words.contains(endWord)){
            return res;
        }
        Map<String,Integer>m=new HashMap<>();
        m.put(beginWord,0);
        Queue<String>q=new LinkedList<>();
        q.add(beginWord);
        int level=0;
        while(!q.isEmpty()){
            int n=q.size();
            level++;
            Set<String>usedThisLevel=new HashSet<>();
            for(int i=0;i<n;i++){
                String s=q.remove();
                char[] temp=s.toCharArray();
                for(int j=0;j<temp.length;j++){
                    char orginal=temp[j];
                    for(char ch='a';ch<='z';ch++){
                        temp[j]=ch;
                        String str=new String(temp);
                        if(!words.contains(str))continue;
                        if(!m.containsKey(str)){
                            m.put(str,level);
                            q.add(str);
                            usedThisLevel.add(str);
                        }
                    }
                    temp[j]=orginal;
                }
            }
            words.removeAll(usedThisLevel);
        }
        List<String>path=new ArrayList<>();
        path.add(endWord);
        dfs(endWord,beginWord,m,path);
        return res;
    }
    public void dfs(String word,String beginWord,Map<String,Integer>m,List<String>path){
        if(word.equals(beginWord)){
            List<String>temp=new ArrayList<>(path);
            Collections.reverse(temp);
            res.add(temp);
            return;
        }
        int currLevel=m.get(word);
        char arr[]=word.toCharArray();
        for(int i=0;i<arr.length;i++){
            char orginal=arr[i];
            for(char ch='a';ch<='z';ch++){
                arr[i]=ch;
                String prev=new String(arr);
                if(m.containsKey(prev) && m.get(prev)==currLevel-1){
                    path.add(prev);
                    dfs(prev,beginWord,m,path);
                    path.remove(path.size()-1);
                }
            }
            arr[i]=orginal;
        }
    }
}