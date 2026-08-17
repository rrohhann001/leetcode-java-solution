class MyLinkedList {

    int size;
    Node head;

    public MyLinkedList() {
        this.head=null;
        this.size=0;
        
    }
    
    public int get(int index) {
        if(index<0 || index>=size){
            return -1;
        }
        Node<Integer> temp=head;
        int count=0;
        while(count<index && temp!=null){
            temp=temp.next;
            count++;
        }

        return temp.data;
        
    }
    
    public void addAtHead(int val) {
        Node<Integer> newNode=new Node<>(val);
        if(head==null){
            head=newNode;
            size++;
            return;
        }

        newNode.next=head;
        head=newNode;
        size++;
        return;
        
    }
    
    public void addAtTail(int val) {
        Node<Integer> newNode=new Node<>(val);
        if(head==null){
            head=newNode;
            size++;
            return;
        }
        Node<Integer> temp=head;
        while(temp.next!=null){
            temp=temp.next;
        }
        temp.next=newNode;
        size++;
        
    }
    
    public void addAtIndex(int index, int val) {
        Node<Integer> newNode=new Node<>(val);
        if(index>size || index<0){
            return;
        }

        else if(index==0){
            addAtHead(val);
        }

        else if(index==size){
            addAtTail(val);
        }

        else{
            int count=0;
            Node<Integer> temp=head;
            while(count<index-1){
                temp=temp.next;
                count++;
            }
            newNode.next=temp.next;
            temp.next=newNode;
            size++;
        }
        
    }
    
    public void deleteAtIndex(int index) {

        if(size==0 || index>=size || index<0){
            return;
        }

        if(index==0){
            head=head.next;
            size--;
            return;
        }

        Node<Integer> temp=head;
        int count=0;
        while(count<index-1 ){
            temp=temp.next;
            count++;
        }
        temp.next=temp.next.next;
        size--;
        
    }
}

class Node<T>{
    T data;
    Node<T> next;

    Node(){
        this.next=null;
    }

    Node(T data){
        this.data=data;
        this.next=null;
    }
}

/**
 * Your MyLinkedList object will be instantiated and called as such:
 * MyLinkedList obj = new MyLinkedList();
 * int param_1 = obj.get(index);
 * obj.addAtHead(val);
 * obj.addAtTail(val);
 * obj.addAtIndex(index,val);
 * obj.deleteAtIndex(index);
 */