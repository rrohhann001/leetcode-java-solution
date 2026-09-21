class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack=new Stack<>();
        int result=0;
        for(String str: tokens){
            if(str.equals("+")){
                int num1=stack.pop();
                int num2= stack.pop();
                result=num1+num2;
                stack.push(result);
            }
            else if(str.equals("-")){
                int num1=stack.pop();
                int num2= stack.pop();
                result=num2-num1;
                stack.push(result);
            }
            else if(str.equals("*")){
                int num1=stack.pop();
                int num2= stack.pop();
                result=num2*num1;
                stack.push(result);
            }
            else if(str.equals("/")){
                int num1=stack.pop();
                int num2= stack.pop();
                if(num2!=0){
                    result=num2/num1;
                }
                stack.push(result);
            }
            else{
                stack.push(Integer.parseInt(str));
            }
        }

        return stack.pop();
        
    }
}