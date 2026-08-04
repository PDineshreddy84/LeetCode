class BrowserHistory {
    Stack<String>st1;
    Stack<String>st2;
    public BrowserHistory(String homepage) {
        st1=new Stack<>();
        st2=new Stack<>();
        st1.push(homepage);
    }
    
    public void visit(String url) {
        st2.clear();
        st1.push(url);
    }
    
    public String back(int steps) {
        while(steps-->0 && st1.size()>1){
            st2.push(st1.pop());
        }
        return st1.peek();
    }
    
    public String forward(int steps) {
        while(steps-->0 && st2.size()>0){
            st1.push(st2.pop());
        }
        return st1.peek();
    }
}

/**
 * Your BrowserHistory object will be instantiated and called as such:
 * BrowserHistory obj = new BrowserHistory(homepage);
 * obj.visit(url);
 * String param_2 = obj.back(steps);
 * String param_3 = obj.forward(steps);
 */