class Solution {
    public int sumOfSquares(int[] nums) {
        int n=nums.length;
        int ans=0;
        int i=1;
        while(i<=n){
            if(n%i==0){
                ans = ans+nums[i-1]*nums[i-1];
            }
            i++;
        }
        return ans;
        
    }
}