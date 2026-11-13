class Solution {
    public int xorOperation(int n, int start) {
        int result=0;
        int i=start;
        while(n>0){
            result^=i;
            i=i+2;
            n--;
        }
        return result;
    }
}