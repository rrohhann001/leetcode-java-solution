class Solution {
    public String reorganizeString(String s) {
        int[] arr = new int[26];
        for(int i=0;i<s.length(); i++){
            arr[s.charAt(i)-'a']++;
        }
        int letter=0;
        int max=0;
        for(int i=0; i<26;i++){
            if(max<arr[i]){
                max=arr[i];
                letter=i;
            }
        }

        if(max > (s.length()+1)/2){
            return "";
        }
        char[] res=new char[s.length()];

        //fill all even palces with majority character 
        int idx=0;
        while(arr[letter]-- > 0){
            res[idx]=(char) (letter+'a');
            idx+=2;
        }


        //fill the remaining characters
        for(int i=0;i<26;i++){
            while(arr[i]-->0){
                if(idx>=res.length){
                    idx=1;
                }
                res[idx]=(char) (i+'a');
                idx+=2;
            }
        }

        return String.valueOf(res);

    }
}