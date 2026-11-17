class Solution {
    public int maxSubArray(int[] nums) {
        //brute force
        //time limeit exceeded
        // int ans=Integer.MIN_VALUE;
        // int n=nums.length;
        // for(int i=0;i<n;i++){
        //     int sum=0;
        //     for(int j=i;j<n;j++){
        //         sum+=nums[j];
        //         if(sum>ans){
        //             ans=sum;
        //         }
        //     }
        // }
        // return ans;

        //approch 2 optimized, cadan's algo
        int currSum=nums[0];
        int maxSum=nums[0];
        int n=nums.length;
        for(int i=1;i<n;i++){
            currSum=Math.max(currSum+nums[i],nums[i]);
            maxSum=Math.max(currSum,maxSum);
        }
        return maxSum;
    }
}