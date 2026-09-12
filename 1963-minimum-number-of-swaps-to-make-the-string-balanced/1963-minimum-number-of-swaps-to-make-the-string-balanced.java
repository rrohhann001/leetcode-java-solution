class Solution {
    public int minSwaps(String s) {

        //this is my first approch with stack that beats 8.77% and runtime 124ms 
        // Stack<Character> st=new Stack<>();
        // for(int i=0;i<s.length();i++){
        //     if(st.isEmpty()){
        //         st.push(s.charAt(i));
        //     }
        //     else if(s.charAt(i)=='['){
        //         st.push(s.charAt(i));
        //     }
        //     else{
        //         st.pop();
        //     }
        // }
        // int count=0;
        // while(!st.isEmpty()){
        //     st.pop();
        //     count++;
        // }

        // return count/2;


        int balance=0;
        int count=0;
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch=='['){
                balance++;
            }
            else if(balance>0){
                balance--;
            }
            else{
                count++;
            }
        }

        int ans=(balance+count)/2;
        int countOfTwoInAns=ans/2;
        if(ans%2==0){
            return countOfTwoInAns;
        }
        return countOfTwoInAns+1;
    }
}