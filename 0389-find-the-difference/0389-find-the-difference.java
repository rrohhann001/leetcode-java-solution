class Solution {
    public char findTheDifference(String s, String t) {
        int result=0;
        int len1=s.length()-1;
        int len2=t.length()-1;
        while(len1>=0&&len2>=0){
            result=result^s.charAt(len1)^t.charAt(len2);
            len1--;
            len2--;
        }
        if(len1>=0){
            return (char)(result^s.charAt(len1));
        }
        return (char)(result^t.charAt(len2));
        
    }
}