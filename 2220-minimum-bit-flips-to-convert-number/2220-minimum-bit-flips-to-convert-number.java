class Solution {
    public int minBitFlips(int start, int goal) {
        // int bit=1;
        // int count=0;
        // while(start!=goal){
        //     if((start&bit)!=(goal&bit)){
        //         start=start^bit;
        //         count++;
        //     }
        //     bit=bit<<1;
        // }
        // return count;

        //second approch thoda kam samjh mai aarahi hai(meri nahi hai)
        int n=start^goal;
        int count=0;
        while(n!=0){
            n=n&(n-1);
            count++;

        }
        return count;
        
    }
}