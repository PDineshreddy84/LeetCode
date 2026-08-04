class StockSpanner {
    Stack<Pair>st;
    int i=0;
    public StockSpanner() {
        i=0;
        st=new Stack<>();
    }
    public int next(int price) {
       while(!st.isEmpty() && price>=st.peek().val){
            st.pop();
       }
       int ans=i-(st.isEmpty()?-1:st.peek().ind);
       st.push(new Pair(price,i));
       i++;
       return ans;
    }
}
class Pair{
    int val,ind;
    Pair(int val,int ind){
        this.val=val;
        this.ind=ind;
    }
}
/**
 * Your StockSpanner object will be instantiated and called as such:
 * StockSpanner obj = new StockSpanner();
 * int param_1 = obj.next(price);
 */