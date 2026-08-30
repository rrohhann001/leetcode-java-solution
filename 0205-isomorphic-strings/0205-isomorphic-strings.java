class Solution {
    public boolean isIsomorphic(String s, String t) {
        // if(s.length()!=t.length()){
        //     return false;
        // }

        //String Builder thoda fast hota hai normal string se 
        StringBuilder sbS=new StringBuilder(s);
        StringBuilder sbT=new StringBuilder(t); 
        HashMap<Character, Character> sToTMap=new HashMap<>();
        HashMap<Character, Character> tToSMap=new HashMap<>();
        for(int i=0;i<s.length();i++){
            char s1=sbS.charAt(i);
            char t1=sbT.charAt(i);

            if(!sToTMap.containsKey(s1)){
                sToTMap.put(s1,t1);
            }

            if(!tToSMap.containsKey(t1)){
                tToSMap.put(t1,s1);
            }

            if(sToTMap.get(s1)!=t1 ||tToSMap.get(t1)!=s1){
                return false;
            }
        }
        return true;
        
    }
}