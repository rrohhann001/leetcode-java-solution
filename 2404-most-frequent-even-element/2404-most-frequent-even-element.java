class Solution {
    public int mostFrequentEven(int[] nums) {
        Arrays.sort(nums);
        int maxCount=0;
        int ans=-1;
        int i=0;
        while(i<nums.length){
            if(nums[i]%2!=0){
                i++;
                continue;
            }
            int count=1;
            int j=i+1;
            while(j<nums.length && nums[j]==nums[i]){
                count++;
                j++;
            }
            if(maxCount<count || count==maxCount && nums[i]<ans){
                ans=nums[i];
                maxCount=count;
            }
            i=j;
        }
        return ans;









        //brute force
        // int ans=-1;
        // int maxFreq=0;
        // for(int i=0;i<nums.length;i++){
        //     int temp=nums[i];
        //     if(temp%2!=0){
        //         continue;
        //     }
        //     int count=1;
        //     for(int j=i+1;j<nums.length;j++){
        //         if(temp==nums[j]){
        //             count++;
        //         }
        //     }
        //     if(maxFreq<count || maxFreq==count && temp<ans){
        //         maxFreq=count;
        //         ans=temp;
        //     }
        // }
        // return ans;
        
    }
}