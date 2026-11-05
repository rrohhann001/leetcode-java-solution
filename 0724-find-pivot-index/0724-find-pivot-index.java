class Solution {
    public int pivotIndex(int[] nums) {
        int rigthSum=0;
        for(int n:nums){
            rigthSum+=n;
        }
        int leftSum=0;
        for(int i=0;i<nums.length;i++){
            rigthSum=rigthSum-nums[i];
            if(leftSum==rigthSum){
                return i;
            }
            leftSum+=nums[i];

        }
        return -1;
        
    }
}