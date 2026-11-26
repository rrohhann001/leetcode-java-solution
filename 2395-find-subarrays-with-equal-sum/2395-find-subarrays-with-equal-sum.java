class Solution {
    public boolean findSubarrays(int[] nums) {
        Set<Integer> set=new HashSet<>();
        for(int i=0;i<nums.length-1;i++){
            int num=nums[i]+nums[i+1];
            if(set.contains(num)){
                return true;
            }
            set.add(num);
        }
        return false;
    }
}