class Solution {
    public int lengthOfLongestSubstring(String s) {

        if(s.isEmpty()){
            return 0;
        }
        
        int subString=0;
        int count=0;
        Set<Character> set=new HashSet<>();
        for(int i=0;i<s.length();i++){
            count=0;
            for(int j=i;j<s.length();j++){ 
                
                if(!set.add(s.charAt(j))){
                    set.clear();
                    break;
                }
                count++;
                  
            }
            if(subString<count){
                subString=count;
            }

        }
        return subString;
        
    }
}