class Solution {
    public int[] searchRange(int[] nums, int target) {

        int lb=0;
        int ub=nums.length-1;
        int[] arr=new int[2];
        int firstPosition=-1;
        int lastPosition=-1;
        int mid;

        while(lb<=ub){

            mid=lb+(ub-lb)/2;

            if(nums[mid]==target){
                firstPosition=mid;
                ub=mid-1;
            }

            else if(nums[mid]>target){
                ub=mid-1;
            }

            else if(nums[mid]<target){
              lb=mid+1;  
            }
        }

        lb=0;
        ub=nums.length-1;
        while(lb<=ub){

            mid=lb+(ub-lb)/2;

            if(nums[mid]==target){
                lastPosition=mid;
                lb=mid+1;
            }

            else if(nums[mid]>target){
                ub=mid-1;
            }

            else if(nums[mid]<target){
              lb=mid+1;  
            }
        }

        arr[0]=firstPosition;
        arr[1]=lastPosition;
        
        return arr;
    }
}