class Solution {
    public String addBinary(String a, String b) {
        StringBuilder result=new StringBuilder();
        int carry=0;
        int bit=0;
        int i=a.length()-1;
        int j=b.length()-1;
        while(i>=0&&j>=0){
            bit=(a.charAt(i)-'0')+(b.charAt(j)-'0')+carry;
            if(bit==0||bit==1){
                result.append(bit);
                carry=0;
            }
            else if(bit==2){
                result.append(0);
                carry=1;
            }
            else{
                result.append(1);
                carry=1;
            }
            i--;
            j--;
        }
        while(j>=0){
            bit=carry+b.charAt(j)-'0';
            if(bit==0||bit==1){
                result.append(bit);
                carry=0;
            }
            else{
                result.append(0);
                carry=1;
            }
            j--;
        }
        while(i>=0){
            bit=carry+a.charAt(i)-'0';
            if(bit==0||bit==1){
                result.append(bit);
                carry=0;
            }
            else{
                result.append(0);
                carry=1;
            }
            i--;
        }
        if(carry==1){
            result.append(1);
        }

        return result.reverse().toString();
        
    }
}