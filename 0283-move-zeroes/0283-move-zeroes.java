class Solution {
    public void moveZeroes(int[] nums) {
        int j=0;
        for(int i=0;i<nums.length-1;i++){
            if(nums[j]==0&&nums[i+1]!=0){
                int temp=nums[j];
                nums[j]=nums[i+1];
                nums[i+1]=temp;
                j++ ;
            }
            else if(nums[j]!=0){
                j++;
            }
            
        }  
    }
}