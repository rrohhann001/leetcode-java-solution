class Solution {
    public char repeatedCharacter(String s) {
        //bohut easy tha
        HashSet<Character> set=new HashSet<>();
        for(char ch:s.toCharArray()){
            if(set.contains(ch)){
                return ch;
            }
            set.add(ch);
        }
        //yahan kuchh bhi likh sakte hai lekin ek char type bass
        return ' ';
        
    }
}