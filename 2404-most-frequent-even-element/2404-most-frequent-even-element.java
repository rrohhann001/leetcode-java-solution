class Solution {
    public int mostFrequentEven(int[] nums) {
        //brute force
        int ans=-1;
        int maxFreq=0;
        for(int i=0;i<nums.length;i++){
            int temp=nums[i];
            if(temp%2!=0){
                continue;
            }
            int count=1;
            for(int j=i+1;j<nums.length;j++){
                if(temp==nums[j]){
                    count++;
                }
            }
            if(maxFreq<count || maxFreq==count && temp<ans){
                maxFreq=count;
                ans=temp;
            }
        }
        return ans;
        
    }
}