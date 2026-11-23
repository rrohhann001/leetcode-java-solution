class Solution {
    public String findValidPair(String s) {
        int[] arr=new int[10];
        for(int i=0;i<s.length();i++){
            arr[s.charAt(i)-'0']++;
        }

        int i=0;
        int j=1;
        while(j<s.length()){
            char ch1=s.charAt(i);
            char ch2=s.charAt(j);
            if(ch1!=ch2){
                if(ch1-'0'==arr[ch1-'0'] && ch2-'0'==arr[ch2-'0']){
                    return ""+ch1+ch2;
                }
            }
            i=j;
            j++;

        }
        return "";
        
    }
}