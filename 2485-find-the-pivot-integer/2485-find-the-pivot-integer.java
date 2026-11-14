class Solution {
    public int pivotInteger(int n) {
        int totalSum=n*(n+1)/2;
        int prefix=0;
        for(int i=1;i<=n;i++){
            totalSum=totalSum-i;
            if(prefix==totalSum){
                return i;
            }
            prefix+=i;
        }
        return -1;
        
    }
}