class Solution {
    public boolean isIsomorphic(String s, String t) {
        // if(s.length()!=t.length()){
        //     return false;
        // }


        // HashMap<Character, Character> sToTMap=new HashMap<>();
        // HashMap<Character, Character> tToSMap=new HashMap<>();

        int[] sToTMap = new int[128];
        int[] tToSMap =new int[128];
        Arrays.fill(sToTMap,-1);
        Arrays.fill(tToSMap,-1);
        //String Builder thoda fast hota hai normal string se isi liye use kiya hai bass 
        StringBuilder sbS=new StringBuilder(s);
        StringBuilder sbT=new StringBuilder(t);
        
        for(int i=0;i<s.length();i++){
            char s1=sbS.charAt(i);
            char t1=sbT.charAt(i);

            // if(!sToTMap.containsKey(s1)){
            //     sToTMap.put(s1,t1);
            // }
            if(sToTMap[s1]==-1){
                sToTMap[s1]=t1;
            }

            // if(!tToSMap.containsKey(t1)){
            //     tToSMap.put(t1,s1);
            // }
            if(tToSMap[t1]==-1){
                tToSMap[t1]=s1;
            }

            // if(sToTMap.get(s1)!=t1 ||tToSMap.get(t1)!=s1){
            //     return false;
            // }
            if(sToTMap[s1]!=t1 ||tToSMap[t1]!=s1){
                return false;
            }
        }
        return true;


        //Hash Map slow hota hai array se and Hash map vali approch beats only 27.06% an run time 18ms.
        
    }
}