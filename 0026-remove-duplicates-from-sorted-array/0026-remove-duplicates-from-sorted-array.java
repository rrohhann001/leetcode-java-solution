class Solution {
    public int removeDuplicates(int[] nums) {
        int i=0;
        int j=1;
        int k=1;
        while(i<nums.length&&j<nums.length){
            if(nums[i]==nums[j]){
                j++;
            }
            else{
                i++;
                nums[i]=nums[j];
                j++;
                k++;
            }
        }
        return k;
        
    }
}