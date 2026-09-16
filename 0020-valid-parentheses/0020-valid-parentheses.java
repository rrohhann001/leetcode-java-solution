class Solution {
    public boolean isValid(String s) {

        //both are completly same but uncommented code is more clear
        // if(s.length()%2!=0){
        //     return false;
        // }
        // Stack<Character> st=new Stack<>();

        // for(int i=0;i<s.length();i++){
        //     if(s.charAt(i)=='(' || s.charAt(i)=='{' || s.charAt(i)=='['){
        //         st.push(s.charAt(i));
        //     }

        //     else  if(st.size()==0){
        //         return false;
        //     }

        //     else if((st.peek()=='(' && s.charAt(i)==')')
        //         || (st.peek()=='[' && s.charAt(i)==']')
        //         || (st.peek()=='{' && s.charAt(i)=='}')){

        //             st.pop();
        //     }

        //     else{
        //         return false;
        //     }
        // }
        // return st.size()==0;


        int n=s.length();
        if(n%2!=0){
            return false;
        }
        Stack<Character> stack=new Stack<>();
        for(int i=0;i<n;i++){
            char ch=s.charAt(i);
            if(ch=='(' || ch=='{' || ch=='['){
                stack.push(ch);
            }
            else{
                if(stack.isEmpty()){
                    return false;
                }

                char top=stack.peek();
                if(ch==')' && top!='('){
                    return false;
                }

                else if(ch==']' && top!='['){
                    return false;
                }

                else if(ch=='}' && top!='{'){
                    return false;
                }
                else{
                    stack.pop();
                }
            }
        }

        return stack.isEmpty();
        
    }
}