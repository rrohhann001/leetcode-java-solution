class MyStack {

    //uncommented is follow up question
    // Queue<Integer> queue1;
    // Queue<Integer> queue2;

    Queue<Integer> queue;

    public MyStack() {
        // queue1=new LinkedList<>();
        // queue2=new LinkedList<>();

        queue=new LinkedList<>();
        
    }
    
    public void push(int x) {
        // while(!queue1.isEmpty()){
        //     queue2.offer(queue1.poll());
        // }

        // queue1.offer(x);
        // while(!queue2.isEmpty()){
        //     queue1.offer(queue2.poll());
        // }

        queue.offer(x);

    }
    
    public int pop() {
        // if(empty()){
        //     return -1;
        // }
        // return queue1.poll();

        int size=queue.size();
        for(int i=0;i<size-1;i++){
            queue.offer(queue.poll());
        }
        return queue.poll();
        
    }
    
    public int top() {
        // if(empty()){
        //     return -1;
        // }
        // return queue1.peek();

        int size=queue.size();
        for(int i=0;i<size-1;i++){
            queue.offer(queue.poll());
        }
        int val = queue.peek();
        queue.offer(queue.poll());
        return val;

    }
    
    public boolean empty() {
        return queue.isEmpty();
        
    }
}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */