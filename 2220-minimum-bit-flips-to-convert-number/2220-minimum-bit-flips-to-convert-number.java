class Solution {
    public int minBitFlips(int start, int goal) {
        int bit=1;
        int count=0;
        while(start!=goal){
            if((start&bit)!=(goal&bit)){
                start=start^bit;
                count++;
            }
            bit=bit<<1;
        }
        return count;
        
    }
}