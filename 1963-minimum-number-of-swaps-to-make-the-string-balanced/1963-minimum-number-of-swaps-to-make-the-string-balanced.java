class Solution {
    public int minSwaps(String s) {
        Stack<Character> st=new Stack<>();
        for(int i=0;i<s.length();i++){
            if(st.isEmpty()){
                st.push(s.charAt(i));
            }
            else if(s.charAt(i)=='['){
                st.push(s.charAt(i));
            }
            else{
                st.pop();
            }
        }
        int count=0;
        while(!st.isEmpty()){
            st.pop();
            count++;
        }

        return count/2;
    }
}