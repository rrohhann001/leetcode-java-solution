class Solution {
    public int[] evenOddBit(int n) {
        int arr[] = new int[2];
        int i=0;
        while(n>0){
            if(i%2==0 && (n&1)!=0){
                arr[0]++;
            }
            else if(i%2!=0 && (n&1)!=0){
                arr[1]++;
            }
            i++;
            n=n>>1;
        }
        return arr;
        
    }
}