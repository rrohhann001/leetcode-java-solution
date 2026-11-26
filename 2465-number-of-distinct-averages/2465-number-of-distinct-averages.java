class Solution {
    public int distinctAverages(int[] nums) {
        HashMap<Double,Integer> map=new HashMap<>();
        Arrays.sort(nums);
        int i=0;
        int j=nums.length-1;
        int count=0;
        while(i<j){
            double temp=(nums[i]+nums[j])/2.0;
            if(!map.containsKey(temp)){
                count++;
                map.put(temp,1);
            }
            i++;
            j--;
        }
        return count;
    }
}