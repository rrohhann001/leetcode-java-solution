class Solution {
    public int divide(int dividend, int divisor) {
        // int ans=(int)(dividend/divisor);
        // return ans; without this /,%,* oprators

        if (dividend == divisor)
            return 1;
        long temp1=Math.abs((long)dividend);
        long temp2=Math.abs((long)divisor);
        if(temp2==1){
            if((dividend<0) !=  (divisor<0)){
                return -(int)temp1;
            }
            else{
                if(dividend<0 && divisor<0 && dividend==Integer.MIN_VALUE){
                    return (int)temp1-1;
                }
                return (int)temp1;
            }

        }
        int count=0;
        
        while(temp1>=temp2){
            temp1=temp1-temp2;
            count++;
        }
        if((dividend<0) !=  (divisor<0)){
            return -count;
        }
        return count;

        
    }
}