class Solution {
    public int findMin(int[] nums) {

        if(nums[0]<nums[nums.length-1]){
            return nums[0];
        }

        int ans=binarySearch(nums[0], 0,nums.length-1,nums);
        return ans;
    }    

    private int binarySearch(int min, int lb, int ub, int[] nums){
        
        while(lb<=ub){
            int mid=lb+(ub-lb)/2;
            if(nums[mid]<min || mid>1 && nums[mid-1]<min){
                min=nums[mid];
                ub=mid-1;
            }

            else {
                lb=mid+1;
            }
        }
        if(min<nums[0] || ub==0){
            return min;
        }
        else if(ub>1){
            min= binarySearch(min,0,ub/2-1,nums);
        }
        

        return min;
        
    }
}