class Solution {
    public String decodeString(String s) {
       Stack<String> str=new Stack<>();
       Stack<Integer> num=new Stack<>();

       int count=0;
       StringBuilder s1=new StringBuilder();

       for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);

            //digit
            if(ch>='0' && ch<='9'){
            count=count*10+(ch-'0');
            }
            else if(ch=='['){
                str.push(s1.toString());
                num.push(count);
                s1.setLength(0);
                count=0;
            }
            else if(ch==']'){
                int n=num.pop();
                String s2=str.pop();

                StringBuilder res=new StringBuilder();
                res.append(s2);
                for(int j=0;j<n;j++){
                    res.append(s1);
                }
                s1.setLength(0);
                s1.append(res);
            }

            else{
                s1.append(ch);
            }
        }
        return s1.toString();
        
    }
}