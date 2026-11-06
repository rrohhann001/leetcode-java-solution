class Solution {
    public int findMiddleIndex(int[] nums) {
        //same as 724
        int totalSum=0;
        int n=nums.length;
        for(int i=0;i<n;i++){
            totalSum+=nums[i];
        }

        int leftSum=0;
        for(int i=0;i<n;i++){
            int rigthSum=totalSum-nums[i]-leftSum;
            if(leftSum==rigthSum){
                return i;
            }
            leftSum+=nums[i];
        }
        return -1;
        
    }
}