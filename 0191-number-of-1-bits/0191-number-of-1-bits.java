class Solution {
    public int hammingWeight(int n) {
        int count=0;

        //this beats 100% and rutime 0ms
        // while(n>0){
        //     if((n&1)!=0){
        //         count++;
        //     }
        //     n=n>>1;
        // }
        // return count;
        while(n!=0){
            count++;
            n=n&(n-1);
        }
        return count;
        
    }
}