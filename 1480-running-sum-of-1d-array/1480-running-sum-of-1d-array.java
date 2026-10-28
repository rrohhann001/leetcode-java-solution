class Solution {
    public int[] runningSum(int[] nums) {
        //brute force
        int n=nums.length;
        // int[] result=new int[n];
        // for(int i=0;i<n;i++){
        //     int sum=0;
        //     for(int j=i;j>=0;j--){
        //         sum+=nums[j];
        //     }
        //     result[i]=sum;
        // }
        // return result; 
        //T.C=O(n*n) and S.C=O(n)

        //optimize
        for(int i=1;i<n;i++){
            nums[i]=nums[i-1]+nums[i];
        }
        return nums;
        
    }
}