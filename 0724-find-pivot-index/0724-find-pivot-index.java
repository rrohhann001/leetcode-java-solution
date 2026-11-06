class Solution {
    public int pivotIndex(int[] nums) {
        //optimal approch
        int n=nums.length;
        int[] prefix=new int[n];
        int[] suffix=new int[n];

        //calculate prefix array
        prefix[0]=nums[0];
        for(int i=1;i<n;i++){
            prefix[i]=prefix[i-1]+nums[i];
        }

        //calculate suffix array
        suffix[n-1]=nums[n-1];
        for(int i=n-2;i>=0;i--){
            suffix[i]=nums[i]+suffix[i+1];
        }

        for(int i=0;i<n;i++){
            int leftSum=(i==0)? 0 : prefix[i-1];
            int rightSum=(i==n-1)? 0 : suffix[i+1];
            if(leftSum==rightSum){
                return i;
            }
        }
        return -1;

        // optimized approch
        // int rigthSum=0;
        // for(int n:nums){
        //     rigthSum+=n;
        // }
        // int leftSum=0;
        // for(int i=0;i<nums.length;i++){
        //     rigthSum=rigthSum-nums[i];
        //     if(leftSum==rigthSum){
        //         return i;
        //     }
        //     leftSum+=nums[i];

        // }
        // return -1;
        
    }
}