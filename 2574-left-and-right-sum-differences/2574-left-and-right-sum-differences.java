class Solution {
    public int[] leftRightDifference(int[] nums) {
        //same approch as in which 1991 and 724 I used
        int rigthSum=0;
        int n=nums.length;
        int[] result=new int[n];
        for(int i:nums){
            rigthSum+=i;
        }

        int leftSum=0;
        for(int i=0;i<n;i++){
            rigthSum=rigthSum-nums[i];
            result[i]=Math.abs(leftSum-rigthSum);
            leftSum+=nums[i];
        }
        
        return result;
        
    }
}