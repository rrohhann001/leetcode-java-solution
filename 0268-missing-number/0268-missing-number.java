class Solution {
    public int missingNumber(int[] nums) {
        //this is my first approch becasue i now how XOR operator works

        // int ans=nums.length;
        // for(int i=0;i<nums.length;i++){
        //     ans=i^ans^nums[i];
        // }
        // return ans;

        //this is my second thought(approch) i now this concept also 
        int totalSum=nums.length*(nums.length+1)/2;
        int sum=0;
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
        }

        return totalSum-sum;
    }
}