class Solution {
    public String digitSum(String s, int k) {
 
        while(s.length()>k){
            int count=0;
            int temp=0;
            int i=0;
            StringBuilder result=new StringBuilder();
            while(i<s.length()){
                if(count<k){
                    temp+=s.charAt(i)-'0';
                    count++;
                    i++;
                }
                else{
                    result.append(temp);
                    count=0;
                    temp=0;
                }
                
            }
            if(count!=0){
                result.append(temp);
            }
            s=result.toString();
        }
        return s;
        
    }
}