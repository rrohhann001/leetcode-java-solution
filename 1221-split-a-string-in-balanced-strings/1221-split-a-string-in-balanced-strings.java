class Solution {
    public int balancedStringSplit(String s) {
        int count=0;
        int balance=0;
        char ch=s.charAt(0);
        for(int i=0;i<s.length(); i++){
            
            if(balance==0){
                ch = s.charAt(i);
                balance++;
                count++;
            }
            else if(ch==s.charAt(i)){
                balance++;
            }
            else{
                balance--;
            }
        }

        return count;




        //my first approch take 2ms time and above is best approch  
        // Stack<Character> st=new Stack<>();
        // int count=0;
        // for(int i=0;i<s.length();i++){
        //     if(st.isEmpty()){
        //         st.push(s.charAt(i));
        //         count++;
        //     }
        //     else if(st.peek()==s.charAt(i)){
        //         st.push(s.charAt(i));
        //     }
        //     else{
        //         st.pop();
        //     }
        // }
        // return count;
        
    }
}