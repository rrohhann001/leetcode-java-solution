class Solution {
    public int maxProduct(int[] nums) {
        //brute force
        int ans=nums[0];
        int n=nums.length;
        for(int i=0;i<n;i++){
            int temp=1;
            for(int j=i;j<n;j++){
                temp*=nums[j];
                if(temp>ans){
                    ans=temp;
                }
            }
        }
        return ans;
        
    }
}