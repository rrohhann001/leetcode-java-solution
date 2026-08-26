class Solution {
    public String reverseStr(String s, int k) {
        if(k==1){return s;}
        if(k>s.length()){
            StringBuilder st=new StringBuilder(s);
            return st.reverse().toString();
        }
        StringBuilder st=new StringBuilder();
        int n=0;
        while(n<s.length()){
          int i; 

            if(n + k <= s.length()){

                for(i = n + k - 1; i >= n; i--){
                    st.append(s.charAt(i)); 
                }

                for(i = n + k; i < n + 2 * k && i < s.length(); i++){
                    st.append(s.charAt(i));  
                }

            }
            else{

                // k se kam characters bache hain
                for(i = s.length() - 1; i >= n; i--){
                    st.append(s.charAt(i));
                }

            }

            n=n+2*k;
        }
        return st.toString();
    }
}