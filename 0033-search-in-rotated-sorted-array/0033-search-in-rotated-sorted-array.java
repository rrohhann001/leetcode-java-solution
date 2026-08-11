class Solution {
    private int target;

    public int search(int[] nums, int target) {

        int minIndex=0;
        int lb=0;
        int ub=nums.length-1;
        int mid;
        int result;

        this.target=target;

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

        result=binarySearch(nums,0,minIndex-1);
        if(result>=0){
            return result;
        }

        else{
            return binarySearch(nums,minIndex,nums.length-1);
        }
        
    }

    int binarySearch(int[] nums,int lb, int ub){
        int mid;
        while(lb<=ub){
            mid=lb+(ub-lb)/2;
            if(nums[mid]==target){
                return mid;
            }

            else if(nums[mid]<target){
                lb=mid+1;
            }

            else if(nums[mid]>target){
                ub=mid-1;
            }
            
        }
        return -1;
    }

}