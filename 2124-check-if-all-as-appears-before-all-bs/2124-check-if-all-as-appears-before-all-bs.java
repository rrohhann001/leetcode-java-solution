class Solution {
    public boolean checkString(String s) {
        int i=0;
        for(i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch=='b'){
                break;
            }
        }

        while(i<s.length()){
            if(s.charAt(i)=='a'){
                return false;
            }
            i++;
        }
        return true;

    }
}