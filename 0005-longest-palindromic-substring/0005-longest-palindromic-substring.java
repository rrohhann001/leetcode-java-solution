class Solution {
    public String longestPalindrome(String s) {

        int maxLen=1;
        int st=0;
        int end=0;

        for(int i=1;i<s.length();i++){
            int l=i;
            int r=i;

            while(l>=0 && r<s.length()){
                if(s.charAt(l)==s.charAt(r)){
                    l--;
                    r++;
                }
                else{
                    break;
                }
            }

            int len=r-l-1;  // to "aba" r become 3 and l become -1 so (3-(-1)-1)=3 is length 
            if(maxLen<=len){
                maxLen=len;
                st=l+1;
                end=r-1;
            }


        }

        for(int i=0;i<s.length();i++){
            int l=i;
            int r=i+1;

            while(l>=0 && r<s.length()){
                if(s.charAt(l)==s.charAt(r)){
                    l--;
                    r++;
                }
                else{
                    break;
                }
            }

            int len=r-l-1;
            if(maxLen<=len){
                maxLen=len;
                st=l+1;
                end=r-1;
            }
        }

        return s.substring(st,end+1);

    }
}