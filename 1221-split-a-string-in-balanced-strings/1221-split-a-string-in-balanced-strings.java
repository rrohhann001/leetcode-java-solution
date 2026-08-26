class Solution {
    public int balancedStringSplit(String s) {
        Stack<Character> st=new Stack<>();
        int count=0;
        for(int i=0;i<s.length();i++){
            if(st.isEmpty()){
                st.push(s.charAt(i));
                count++;
            }
            else if(st.peek()==s.charAt(i)){
                st.push(s.charAt(i));
            }
            else{
                st.pop();
            }
        }
        return count;
        
    }
}