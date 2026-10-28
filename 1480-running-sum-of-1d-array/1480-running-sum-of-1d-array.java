class Solution {
    public int[] runningSum(int[] nums) {
        //brute force
        int n=nums.length;
        int[] result=new int[n];
        for(int i=0;i<n;i++){
            int sum=0;
            for(int j=i;j>=0;j--){
                sum+=nums[j];
            }
            result[i]=sum;
        }
        return result;
        
    }
}