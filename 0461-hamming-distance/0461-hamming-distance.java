class Solution {
   
    public int hammingDistance(int x, int y) {
        int temp=x^y;
        int result=0;
        while(temp>0){
            result++;
            temp=temp&(temp-1);
        }
        return result;
    }
}