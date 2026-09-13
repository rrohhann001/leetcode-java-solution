class Solution {
    public int repeatedStringMatch(String a, String b) {
        //this is my first approch that beats 55% and runtime 262ms
        // StringBuilder sb=new StringBuilder(a);
        // int count=1;
        // while(sb.length()<b.length()){
        //     count++;
        //     sb.append(a);     
        // }

        // if(sb.toString().contains(b)){
        //     return count;
        // }
        // sb.append(a);
        // count++;
        // if(sb.toString().contains(b)){
        //     return count;
        // }
        // return -1;


        //
        int lengthA=a.length();
        int lengthB=b.length();
        boolean[] temp=new boolean[26];
        for(int i=0;i<a.length();i++){
            temp[a.charAt(i)-'a']=true;
        }

        for(int i=0;i<b.length();i++){
            if(!temp[b.charAt(i)-'a']){
                return -1;
            }
        }

        int repeatedCount=lengthB/lengthA;
        int count=repeatedCount;
        StringBuilder repeatedString=new StringBuilder();
        while(count>0){
            repeatedString.append(a);
            count--;
        }
        for(int i=1;i<=3;i++){
            if(repeatedString.toString().contains(b)){
                return repeatedCount;
            }
            repeatedString.append(a);
            repeatedCount++;
        }
        return -1;




    }
}