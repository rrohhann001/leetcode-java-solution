class Solution {
    public int findMin(int[] nums) {

        if(nums[0]<=nums[nums.length-1]){
            return nums[0];
        }

        int lb=0;
        int minIndex=0;
        int ub=nums.length-1;
        int mid;

        while(lb<=ub){
            mid=lb+(ub-lb)/2;

            if(nums[mid]<nums[minIndex]){
                minIndex=mid;
                ub=mid-1;
            }
            else{
                lb=mid+1;
            }
        }
        return nums[minIndex];
        
    }
}