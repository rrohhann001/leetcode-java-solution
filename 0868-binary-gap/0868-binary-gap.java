class Solution {
    public int binaryGap(int n) {
        int max = 0;
        int pre = -1;
        int curr = 0;
        while (n > 0) {
            if((n&1)==1){
                if(pre>=0 && max<(curr-pre)){
                    max=curr-pre;
                }
                pre=curr;
            }
            curr++;
            n=n>>1;
        }
        return max;
    }
}