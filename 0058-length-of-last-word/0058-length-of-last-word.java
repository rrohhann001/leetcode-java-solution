class Solution {
    public int lengthOfLastWord(String s) {
        int length=0;
        int i=s.length()-1;
        while(i>=0){
            if(s.charAt(i)!=' '){
                break;
            }
            i--;
        }
        while(i>=0){
            if(s.charAt(i)==' '){
                break;
            }
            length++;
            i--;
        }
        return length;
    }
}