class Solution {
    public int majorityElement(int[] nums) {
        //3 optimal approch. Boyer mooreVoting algorithm
        int candidate=nums[0];
        int count=1;
        for(int i=1;i<nums.length;i++){
            if(candidate==nums[i]){
                count++;
            }
            else{
                count--;
                if(count==0){
                    candidate=nums[i];
                    count=1;
                }
            }
        }
        return candidate;






        // approch 1 brute force
        // int n=nums.length;
        // for(int i=0;i<n;i++){
        //     int count=1;
        //     for(int j=i+1;j<n;j++){
        //         if(nums[i]==nums[j]){
        //             count++;
        //         }
        //     }
        //     if(count>n/2){
        //         return nums[i];
        //     }
        // }
        // return -1;

        // approch 2 optimal sorting
        // Arrays.sort(nums);
        // return nums[nums.length/2];

    }
}