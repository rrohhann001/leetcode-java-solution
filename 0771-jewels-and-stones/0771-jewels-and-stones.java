class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        int count = 0;
        for (int i = 0; i < stones.length(); i++) {
            for (int j = 0; j < jewels.length(); j++) {
                if (stones.charAt(i) == jewels.charAt(j)) {
                    count++;
                    break;
                }
            }
        }
        return count;
    





        //my first approch beats 100% and runtime 0 but above is more efficient code
        // int count=0;
        // for(int i=0;i<jewels.length();i++){
        //     char ch=jewels.charAt(i);
        //     for(int j=0;j<stones.length();j++){
        //         if(ch==stones.charAt(j)){
        //             count++;
        //         }
        //     }
        // }
        // return count;
        
    }
}