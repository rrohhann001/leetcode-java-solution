class Solution {
    public int minAddToMakeValid(String s) {
        Stack<Character> st=new Stack();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(st.isEmpty()){
                st.push(ch);
            }
            else if(st.peek()=='(' && ch==')' ){
                st.pop();
            }
            else{
                st.push(ch);
            }
        }

        int count=0;
        while(!st.isEmpty()){
            st.pop();
            count++;
        }

        return count;
        
    }
}