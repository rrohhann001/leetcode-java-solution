class Solution {
    public void moveZeroes(int[] nums) {
        int j=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=0){
                // int temp=nums[i];
                // nums[i]=nums[j];
                // nums[j]=temp;

                //both are good but this(uncommented) is faster then commented logic
                nums[j]=nums[i];
                j++;
            } 
        }
        while(j<nums.length){
            nums[j]=0;
            j++;
        }  
    }
}