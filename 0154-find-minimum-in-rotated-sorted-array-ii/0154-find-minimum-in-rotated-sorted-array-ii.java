class Solution {
    public int findMin(int[] nums) {

        int lb=0;
        int ub=nums.length-1;

        while(lb<ub){
            int mid=lb+(ub-lb)/2;

            if(nums[mid]>nums[ub]){
                lb=mid+1;
            }

            else if(nums[mid]<nums[ub]){
                ub=mid;
            }

            else{
                ub--;
            }
        }

        return nums[lb];
    }

        //my first approch and logic beats 100% but according  to me it no satisfy all conditions

    //     if(nums[0]<nums[nums.length-1]){
    //         return nums[0];
    //     }

    //     int ans=binarySearch(0,nums.length-1,nums);
    //     if(ans<nums[0]){
    //         return ans;
    //     }

    //     return binarySearch(0,((nums.length-1)/2)-1,nums);
    // }    

    // private int binarySearch(int lb, int ub, int[] nums){
    //     int min=nums[0];
    //     while(lb<=ub){
    //         int mid=lb+(ub-lb)/2;
    //         if(nums[mid]<min ||mid>0 &&nums[mid-1]<min){
    //             min=nums[mid];
    //             ub=mid-1;
    //         }

    //         else {
    //             lb=mid+1;
    //         }
    //     }
    //     return min;
    // }
}