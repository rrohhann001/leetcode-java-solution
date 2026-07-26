class Solution {
    public int lengthOfLongestSubstring(String s) {

        Set<Character> set = new HashSet<>();

        int left = 0;
        int right = 0;
        int maxLength = 0;

        while (right < s.length()) {

            if (!set.contains(s.charAt(right))) {

                set.add(s.charAt(right));
                maxLength = Math.max(maxLength, right - left + 1);
                right++;

            } else {

                set.remove(s.charAt(left));
                left++;

            }
        }

        return maxLength;  
    }

//mera first code jis mai time and space complexity jyada thi upper vala copied hai

    // public int lengthOfLongestSubstring(String s) {

    //     if(s.isEmpty()){
    //         return 0;
    //     }
        
    //     int subString=0;
    //     int count=0;
    //     Set<Character> set=new HashSet<>();
    //     for(int i=0;i<s.length();i++){
    //         count=0;
    //         for(int j=i;j<s.length();j++){ 
                
    //             if(!set.add(s.charAt(j))){
    //                 set.clear();
    //                 break;
    //             }
    //             count++;
                  
    //         }
    //         if(subString<count){
    //             subString=count;
    //         }

    //     }
    //     return subString;
        
    // }
}