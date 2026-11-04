class Solution {
    public int minFlips(int a, int b, int c) {
        int count=0;
        int a2,b2,c2;
        int bit=1;
        for(int i=0;i<32;i++){
            a2=a&bit;
            b2=b&bit;
            c2=c&bit;
            bit=bit<<1;

            if(c2==0){
                if(a2!=0 && b2==0){
                    count++;
                }
                else if( a2==0&& b2!=0){
                    count++;
                }
                else if(a2!=0 && b2!=0){
                    count+=2;

                }
            }
            else{
                if(a2==0&&b2==0){
                    count++;
                }
            }
        }
        return count;
        
    }
}