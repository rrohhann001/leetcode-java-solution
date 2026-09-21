class Solution {
    public int evalRPN(String[] tokens) {
        //this is my first approch and this beats 87.77% and runtime is 6ms, in this i use inbuit stack 
        // Stack<Integer> stack=new Stack<>();
        // int result=0;
        // for(String str: tokens){
        //     if(str.equals("+")){
        //         int num1=stack.pop();
        //         int num2= stack.pop();
        //         result=num1+num2;
        //         stack.push(result);
        //     }
        //     else if(str.equals("-")){
        //         int num1=stack.pop();
        //         int num2= stack.pop();
        //         result=num2-num1;
        //         stack.push(result);
        //     }
        //     else if(str.equals("*")){
        //         int num1=stack.pop();
        //         int num2= stack.pop();
        //         result=num2*num1;
        //         stack.push(result);
        //     }
        //     else if(str.equals("/")){
        //         int num1=stack.pop();
        //         int num2= stack.pop();
        //         if(num2!=0){
        //             result=num2/num1;
        //         }
        //         stack.push(result);
        //     }
        //     else{
        //         stack.push(Integer.parseInt(str));
        //     }
        // }

        // return stack.pop();

        //int this approch i use ArrayList
        //and this is also beats 87.77% and runtimee 6ms

        // List<Integer> stack=new ArrayList<>();
        // int top=-1;
        // int num1;
        // int num2;
        // for(String str: tokens){
        //     switch(str){

        //         case "+":
        //         num1=stack.get(top);
        //         num2=stack.get(top-1);
        //         stack.remove(top);
        //         stack.remove(top-1);
        //         top--;
        //         stack.add(num2+num1);
        //         break;  

        //         case "-":
        //         num1=stack.get(top);
        //         num2=stack.get(top-1);
        //         stack.remove(top);
        //         stack.remove(top-1);
        //         top--;
        //         stack.add(num2-num1);
        //         break; 

        //         case "*":
        //         num1=stack.get(top);
        //         num2=stack.get(top-1);
        //         stack.remove(top);
        //         stack.remove(top-1);
        //         top--;
        //         stack.add(num2*num1);
        //         break; 

        //         case "/":
        //         num1=stack.get(top);
        //         num2=stack.get(top-1);
        //         stack.remove(top);
        //         stack.remove(top-1);
        //         top--;
        //         stack.add(num2/num1);
        //         break;

        //         default:
        //         top++;
        //         stack.add(Integer.parseInt(str));
        //         break;           
        //     }
        // }

        // return stack.get(top);

        //int his i use only simple array
        int[] arr = new int[tokens.length];
        int size = 0;
        for (String str : tokens) {
            switch (str) {

                case "+":
                    arr[size - 2] += arr[size - 1];
                    size--;
                    break;

                case "-":
                    arr[size - 2] -= arr[size - 1];
                    size--;
                    break;

                case "*":
                    arr[size - 2] *= arr[size - 1];
                    size--;
                    break;

                case "/":
                    arr[size - 2] /= arr[size - 1];
                    size--;
                    break;

                default:
                    arr[size] = Integer.parseInt(str);
                    size++;
                    break;
            }
        }

        return arr[size - 1];

    }
}