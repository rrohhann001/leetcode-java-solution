class Solution {
    public String longestCommonPrefix(String[] strs) {

        int s=strs.length;

        String prefixS=strs[0];

        for(int i=0;i<s;i++){

            while(!strs[i].startsWith(prefixS)){
                prefixS=prefixS.substring(0,prefixS.length()-1);
            }

            if(prefixS.isEmpty()){
                return "";
            }

        }

        return prefixS;

    //      if (strs == null || strs.length == 0) return "";

    //      StringBuilder sb=new StringBuilder();
    //      char ch;
    //      for(int i=0;i<strs[0].length();i++){
    //         ch=strs[0].charAt(i);
    //         for(int j=1;j<strs.length;j++){
    //             if(i >= strs[j].length() ||strs[j].charAt(i)!=ch){
    //                return sb.toString();
    //             }
    //         }
    //         sb.append(ch);
    //     }

    //     return sb.toString();
        
    // }
    // this is not accetable by the interviewer 
    //ye ek optimum solution nahi hai kaam to theek kar raha hai
    }
}