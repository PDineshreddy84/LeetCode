class Solution {
    public boolean isPathCrossing(String path) {
        int x=0,y=0;
        Set<Pair>s=new HashSet<>();
        s.add(new Pair(0,0));
        for(char ch:path.toCharArray()){
            if(ch=='N'){
                y++;
            }
            else if(ch=='S'){
                y--;
            }
            else if(ch=='E'){
                x++;
            }
            else if(ch=='W'){
                x--;
            }
            Pair p=new Pair(x,y);
            if(s.contains(p)){
                return true;
            }
            s.add(p);
        }
        return false;
    }
}
class Pair{
    int x,y;
    Pair(int x,int y){
        this.x=x;
        this.y=y;
    }
    public boolean equals(Object o){
        Pair p=(Pair)o;
        return x==p.x && y==p.y;
    }

    public int hashCode(){
        return Objects.hash(x,y);
    }
}
