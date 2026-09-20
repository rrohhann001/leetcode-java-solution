// class MinStack {
//     List<Integer> stack;
//     int top;

//     List<Integer> minStack;
//     int minTop;

//     public MinStack() {
//         stack=new ArrayList<>();
//         top=-1;

//         minStack=new ArrayList<>();
//         minTop=-1;
//     }
    
//     public void push(int value) {
//         top++;
//         stack.add(top,value);

//         if(minTop<0 || value<=minStack.get(minTop)){
//             minTop++;
//             minStack.add(minTop,value);
//         }
        
//     }
    
//     public void pop() {
//         if(minTop<0 || top<0){
//             return;
//         }
//         // else if(stack.get(top)==(minStack.get(minTop))) { ye Integer object ke case mai ye value copaire nahi karta hun ka reference check karta hai
//         else if(stack.get(top).equals(minStack.get(minTop)))  {
//             minTop--;
//         }
//         top--;
        
//     }
    
//     public int top() {
//         if(top>=0){
//             return stack.get(top);
//         }
//         return Integer.MIN_VALUE;
        
//     }
    
//     public int getMin() {
//        if(minTop<0){
//             return Integer.MAX_VALUE;
//        }
//        return minStack.get(minTop);
//     }

class MinStack {
    Stack<Integer> stack;

    Stack<Integer> minStack;

    public MinStack() {
        stack=new Stack<>();

        minStack=new Stack<>();
    }
    
    public void push(int value) {
        stack.push(value);

        if(minStack.isEmpty() || value<=minStack.peek()){
            minStack.push(value);
        }
        
    }
    
    public void pop() {
       if(!minStack.isEmpty() && minStack.peek().equals(stack.peek())){
           minStack.pop();
       }
       stack.pop();
        
    }
    
    public int top() {
        if(stack.isEmpty()){
            return Integer.MIN_VALUE;
        }
        return stack.peek();
        
    }
    
    public int getMin() {
       if(minStack.isEmpty()){
            return Integer.MAX_VALUE;
       }
       return minStack.peek();
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(value);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */