class Solution {
    public boolean hasAlternatingBits(int n) {
        int pre=n&1;
        n=n>>1;
        while(n>0){
            int curr=n&1;
            if(curr==pre){
                return false;
            }
            pre=curr;
            n=n>>1;

        }
        return true;

        //my approch beats 100% and 0ms runtime
        // boolean t1=false;
        // boolean t0=false;
        // while(n>0){
        //     if((n&1)!=0){
        //         if(t1){
        //             return false;
        //         }
        //         t0=false;
        //         t1=true;
        //     }
        //     else{
        //         if(t0){
        //             return false;
        //         }
        //         t0=true;
        //         t1=false;
        //     }
        //     n=n>>1;
        // }
        // return true;
        
    }
}