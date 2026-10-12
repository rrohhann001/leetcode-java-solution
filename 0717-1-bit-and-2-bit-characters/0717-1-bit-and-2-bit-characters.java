class Solution {
    public boolean isOneBitCharacter(int[] bits) {
        Stack<Integer> stack=new Stack<>();
        for(int i=0;i<bits.length-1;i++){
            if(stack.isEmpty() && bits[i]==1){
                stack.push(bits[i]);
            }
            else if(!stack.isEmpty() && stack.peek()==1){
                stack.pop();
            }
            
        }

        if(stack.isEmpty() && bits[bits.length-1]==0){
            return true;
        }
        return false;
       
        
    }
}