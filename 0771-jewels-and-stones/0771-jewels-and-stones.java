class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        //Kyuki standard ASCII characters ke codes 0 se 127 tak hote hain.
        boolean[] isJewels=new boolean[128];
        for(int i=0;i<jewels.length();i++){
            isJewels[jewels.charAt(i)]=true; //kyoki initaily all are false
        }
        int count=0;
        for(int i=0;i<stones.length();i++){
            if(isJewels[stones.charAt(i)]){
                count++;
            }
        }
        return count;




        //my first approch beats 100% and runtime 0 but above is more efficient code
        //for (int i = 0; i < stones.length(); i++) {
        //     for (int j = 0; j < jewels.length(); j++) {
        //         if (stones.charAt(i) == jewels.charAt(j)) {
        //             count++;
        //             break;
        //         }
        //     }
        // }
        // return count;
        
    }
}