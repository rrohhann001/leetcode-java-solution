class StockSpanner {
    Stack<Integer> stack;
    ArrayList<Integer> list;

    public StockSpanner() {
        stack=new Stack<>();
        list=new ArrayList<>();
        
    }
    
    public int next(int price) {
        list.add(price);
        //index->stack.peek()
        //list.get(index)->value
        while(!stack.isEmpty() && list.get(stack.peek())<=price){
            stack.pop();
        }
        int priviousGreaterIndex=stack.isEmpty()?-1:stack.peek();
        int currentIndex=list.size()-1;
        int ans=currentIndex-priviousGreaterIndex;
        stack.push(currentIndex);
        return ans;
        
    }
}

/**
 * Your StockSpanner object will be instantiated and called as such:
 * StockSpanner obj = new StockSpanner();
 * int param_1 = obj.next(price);
 */