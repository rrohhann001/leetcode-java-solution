class Solution {
    // int target;
    public boolean search(int[] nums, int target) {
        int j=nums.length-1;
        for(int i=0;i<=j;i++){
            if(nums[i]==target){
                return true;
            }
            if(nums[j]==target){
                return true;
            }
            j--;
        }

        return false;
        // this.target=target;
        
    //     int lb=0;
    //     int ub=nums.length-1;

    //     int maxIndex=0;        
    //     while(lb<=ub){
    //         int mid=lb+(ub-lb)/2;

    //         if(nums[mid]>=nums[maxIndex]){
    //             maxIndex=mid;
    //             lb=mid+1;
    //         }
    //         else if(nums[mid]<nums[maxIndex]){
    //             ub=mid-1;
    //         }
    //         // else{
    //         //     ub--;
    //         // }

    //     }

    //     if(binarySearch(0,maxIndex-1,nums)){
    //         return true;
    //     }

    //     return (binarySearch(maxIndex,nums.length-1,nums));
    // }

    // private boolean binarySearch(int lb, int ub, int[] nums){
    //     int mid;
    //     while(lb<=ub){
    //         mid=lb+(ub-lb)/2;

    //         if(nums[mid]==target){
    //             return true;
    //         }

    //         else if(nums[mid]<target){
    //             lb=mid+1;
    //         }

    //         else if(nums[mid]>target){
    //             ub=mid-1;
    //         }
    //     }

    //     return false;
    }
}