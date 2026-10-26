class Solution {
    public int rangeBitwiseAnd(int left, int right) {
        //ye hai to theek lekin time limit exceed ho jati hai
        // long res=left;
        // long lb=left;
        // long ub=right;
        // while(lb<=ub){
        //     res=res&lb;
        //     if(res==0){
        //         return (int)res;
        //     }
        //     lb++;
        // }
        // return (int)res;

        //this is my own solution beats 18.45% and runtime 9ms
        // int res=right;
        // right=right-1;
        // while(right>=left){
        //     if(res==0){
        //         return res;
        //     }
        //     res=res&right;
        //     right=res-1;
        // }
        // return res;

        //ye dekhna padega doosre ka dekh kar kiya hai
        while(right>left){
            right=right&(right-1);
        }
        return right;
        
    }
}