class Solution {
    public int findDuplicate(int[] nums) {
        // HashMap<Integer,Integer> map=new HashMap<>();
        // for(int i=0;i<nums.length;i++){
        //     if(map.containsKey(nums[i])){
        //         return nums[i];
        //     }
        //     map.put(nums[i],nums[i]);
            
        // }
        // return 0;

        int i=nums[0];
        while(nums[i]>0){
            int temp=nums[i];
            nums[i]=-nums[i];
            i=temp;
        }
        return i;
        
    }
}