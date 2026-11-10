class Solution {
    public int[] singleNumber(int[] nums) {
        //brute force type approch
        Arrays.sort(nums);
        int i=0;
        int j=1;
        int[] result=new int[2];
        int count=0;
        while(i<j && j<nums.length){
            if(nums[i]==nums[j]){
                i=j+1;
                j=i+1;
            }
            else{
                result[count]=nums[i];
                i++;
                j++;
                count++;
            }
        }
        if(i<nums.length){
            result[count]=nums[i];
        }
        return result;
        
    }
}