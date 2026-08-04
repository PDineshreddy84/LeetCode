class DLL{
    int val;
    DLL prev,next;
    DLL(int val){
        this.val=val;
    }
}
class MyCircularQueue {
        int cap,size=0;
        DLL head=null;
        DLL tail=null;
    public MyCircularQueue(int k) {
        cap=k;
    }
    public boolean enQueue(int value) {
        DLL node=new DLL(value);
        if(head==null){
            head=tail=node;
            size++;
            return true;
        }
        if(size>=cap){
            return false;
        }
        tail.next=node;
        node.prev=tail;
        tail=node;
        size++;
        return true;
    }
    public boolean deQueue() {
        if(size==0){
            return false;
        }
        else if(size==1){
            head=tail=null;
            return true;
        }
        else{
            tail=tail.prev;
            tail.next=null;
            size--;
            return true;
        }
    }
    
    public int Front() {
        if(head==null){
            return -1;
        }
        else{
            return head.val;
        }
    }
    
    public int Rear() {
        if(head==null){
            return -1;
        }
        else{
            return tail.val;
        }
    }
    
    public boolean isEmpty() {
        return size==0;
    }
    
    public boolean isFull() {
        return size==cap;
    }
}

/**
 * Your MyCircularQueue object will be instantiated and called as such:
 * MyCircularQueue obj = new MyCircularQueue(k);
 * boolean param_1 = obj.enQueue(value);
 * boolean param_2 = obj.deQueue();
 * int param_3 = obj.Front();
 * int param_4 = obj.Rear();
 * boolean param_5 = obj.isEmpty();
 * boolean param_6 = obj.isFull();
 */