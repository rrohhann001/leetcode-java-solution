class Solution {
    public int minAddToMakeValid(String s) {
        int balance = 0;
        int count=0;

        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='('){
                balance++;
            }
            else if(balance>0){
                balance--;
            }
            else{
                count++;
            }
        }
        return balance+count;




        // my first approch bets 42.57% and runtime is 2ms above is best approch.
        // Stack<Character> st=new Stack<>();
        // for(int i=0;i<s.length();i++){
        //     char ch=s.charAt(i);
        //     if(st.isEmpty()){
        //         st.push(ch);
        //     }
        //     else if(st.peek()=='(' && ch==')' ){
        //         st.pop();
        //     }
        //     else{
        //         st.push(ch);
        //     }
        // }

        // int count=0;
        // while(!st.isEmpty()){
        //     st.pop();
        //     count++;
        // }

        // return count;
        
    }
}