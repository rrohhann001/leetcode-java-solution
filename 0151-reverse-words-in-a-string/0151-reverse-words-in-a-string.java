class Solution {
    public String reverseWords(String s) {
        StringBuilder rev=new StringBuilder();
        int startIndex=s.length()-1;
        while(startIndex>=0){
            while(startIndex>=0 && s.charAt(startIndex)==' '){
                startIndex--;
            }
            if(startIndex<0){
                break;
            }

            int endIndex=startIndex;
            while(startIndex>=0 && s.charAt(startIndex)!=' '){
                startIndex--;
            }

            if(rev.length()==0){
                rev.append(s.substring(startIndex+1,endIndex+1));
            }
            else{
                rev.append(" ");
                rev.append(s.substring(startIndex+1,endIndex+1));
            }
            
        }

        return rev.toString();




        // this is my first approch that beats 84.87% and runtime 5ms. 
        // and in thius approch I use in build method split() of String. 
        // String[] arr=s.split(" ");
        // StringBuilder rev=new StringBuilder();

        // for(int i=arr.length-1;i>=0;i--){
        //     if(arr[i].length()==0){
        //         continue;
        //     }
        //     else if(rev.length()==0){
        //         rev.append(arr[i]);
        //     }
        //     else{
        //         rev.append(" ");
        //         rev.append(arr[i]);
        //     }
        // }

        // return rev.toString();
    }
}