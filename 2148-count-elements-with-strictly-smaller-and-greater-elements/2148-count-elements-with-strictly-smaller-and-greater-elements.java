class Solution {
    public int countElements(int[] nums) {
        int max=nums[0];
        int min=nums[0];

        int n=nums.length;
        for(int i=1;i<n;i++){
            if(min>nums[i]){
                min=nums[i];
            }
            if(max<nums[i]){
                max=nums[i];
            }
        }

        int count=0;
        for(int i=0;i<n;i++){
            if(min<nums[i] && max>nums[i]){
                count++;
            }
        }

        return count;
        
    }
}