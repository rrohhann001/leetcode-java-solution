class Solution {
    public int findPeakElement(int[] nums) {
        int lb=0;
        int ub=nums.length-1;
        int mid;

        while(lb<ub){
            mid=(lb+ub)/2;

            if(nums[mid]>nums[mid+1]){
              ub=mid;  
            }

            else{
                lb=mid+1;
            }
        }

        return lb;  
    }
}