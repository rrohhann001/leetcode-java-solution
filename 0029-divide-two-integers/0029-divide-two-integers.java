class Solution {
    public int divide(int dividend, int divisor) {
        if (dividend == Integer.MIN_VALUE && divisor == -1) {
            return Integer.MAX_VALUE;
        }
        int qus=0;
        int i;
        long dividend1=Math.abs((long)dividend);
        long divisor1=Math.abs((long)divisor);
        for(i=31;i>=0;i--){
            if((dividend1>>i)>=divisor1){
                dividend1=dividend1-(divisor1<<i);
                qus=qus|(1<<i);
            }
        }
        if((dividend<0)!=(divisor<0)){
            return -qus;
        }
        
        return qus;

        //this beats 2.32% and runtime 1229ms
        // long temp1=Math.abs((long)dividend);
        // long temp2=Math.abs((long)divisor);
        // if(temp2==1){
        //     if((dividend<0) !=  (divisor<0)){
        //         return -(int)temp1;
        //     }
        //     else{
        //         if(dividend<0 && divisor<0 && dividend==Integer.MIN_VALUE){
        //             return (int)temp1-1;
        //         }
        //         return (int)temp1;
        //     }

        // }
        // int count=0;
        
        // while(temp1>=temp2){
        //     temp1=temp1-temp2;
        //     count++;
        // }
        // if((dividend<0) !=  (divisor<0)){
        //     return -count;
        // }
        // return count;

        
    }
}