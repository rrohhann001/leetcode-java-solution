class Solution {
    public String findValidPair(String s) {
        int[] arr=new int[10];
        for(int i=0;i<s.length();i++){
            arr[s.charAt(i)-'0']++;
        }

        int i=0;
        while(i<s.length()-1){
            int ch1=s.charAt(i)-'0';
            int ch2=s.charAt(i+1)-'0';
            if(ch1!=ch2 && (ch1==arr[ch1] && ch2==arr[ch2])){
                return s.substring(i,i+2);
            }
            i++;
        }
        return "";
        
    }
}