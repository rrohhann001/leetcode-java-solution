class Solution {
    public int reverseBits(int n) {
        int reverse=0;
        for(int i=0;i<32;i++){
            if(((n>>i)&1)!=0){
                reverse=(reverse<<1)|1;
            }
            else{
                reverse=(reverse<<1);
            }
        }
        return reverse;
        
    }
}