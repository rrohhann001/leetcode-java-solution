class Solution {
    public int[] twoSum(int[] nums, int target) {
        // brute force approch
        //     for(int i=0;i<nums.length-1;i++){
        //         for(int j=i+1;j<nums.length;j++){
        //             if(nums[i]+nums[j]==target){
        //                 return new int[] {i,j};
        //             }
        //         }
        //     }
        // return null;

        // aptimaize approch using HsahMap
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(map.containsKey(target-nums[i])){
                return new int[]{i,map.get(target-nums[i])};
            }
            map.put(nums[i],i);
        }
        return null;
    }
}