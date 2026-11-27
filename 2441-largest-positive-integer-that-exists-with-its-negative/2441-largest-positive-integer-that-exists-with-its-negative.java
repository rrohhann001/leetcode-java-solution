class Solution {
    public int findMaxK(int[] nums) {
        HashMap<Integer,Integer> map=new HashMap<>();
        int result=-1;
        for(int i=0;i<nums.length;i++){
            int num=Math.abs(nums[i]);
            if(map.containsKey(num) && num>result && nums[i]!=map.get(num)){
                result=num;
            }
            map.put(num,nums[i]);
        }
        return result;
        
    }
}