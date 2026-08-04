class DLL{
    int val;
    DLL prev,next;
    DLL(int val){
        this.val=val;
    }
}
class MyCircularDeque {
        int cap,size=0;
        DLL head=null;
        DLL tail=null;
    public MyCircularDeque(int k) {
        cap=k;
    }
    
    public boolean insertFront(int value) {
        DLL node=new DLL(value);
        if(head==null){
            head=tail=node;
            size++;
            return true;
        }
        if(size>=cap){
            return false;
        }
        head.prev=node;
        node.next=head;
        head=node;
        size++;
        return true;
    }
    
    public boolean insertLast(int value) {
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
    
    public boolean deleteFront() {
        if(size==0){
            return false;
        }
        else if(size==1){
            head=tail=null;
            size--;
            return true;
        }
        else{
            head=head.next;
            head.prev=null;
            size--;
            return true;
        }
    }
    
    public boolean deleteLast() {
        if(size==0){
            return false;
        }
        else if(size==1){
            head=tail=null;
            size--;
            return true;
        }
        else{
            tail=tail.prev;
            tail.next=null;
            size--;
            return true;
        }
    }
    
    public int getFront() {
        if(head==null){
            return -1;
        }
        else{
            return head.val;
        }
    }
    
    public int getRear() {
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
 * Your MyCircularDeque object will be instantiated and called as such:
 * MyCircularDeque obj = new MyCircularDeque(k);
 * boolean param_1 = obj.insertFront(value);
 * boolean param_2 = obj.insertLast(value);
 * boolean param_3 = obj.deleteFront();
 * boolean param_4 = obj.deleteLast();
 * int param_5 = obj.getFront();
 * int param_6 = obj.getRear();
 * boolean param_7 = obj.isEmpty();
 * boolean param_8 = obj.isFull();
 */