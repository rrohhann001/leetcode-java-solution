class Solution {
    public int searchInsert(int[] nums, int target) {

     int lb=0;
     int ub=nums.length-1;
     int mid=0;

     while(lb<=ub){
        mid=lb+(ub-lb)/2;
        if(nums[mid]==target){
            return mid;
        }

        else if(nums[mid]>target){
            ub=mid-1;
        }

        else if(nums[mid]<target){
            lb=mid+1;
        }
     }
     if(nums[mid]>target){
        return mid;
     }
     else{
        return mid+1;
     }
    }
}