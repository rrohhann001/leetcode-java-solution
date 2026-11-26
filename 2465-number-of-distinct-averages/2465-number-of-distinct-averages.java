class Solution {
    public int distinctAverages(int[] nums) {
        //ye bhi easy tha

        Set<Double> set = new HashSet<>();
        Arrays.sort(nums);
        int i=0;
        int j=nums.length-1;
        while(i<j){
            set.add((nums[i]+nums[j])/2.0);
            i++;
            j--;
        }
        return set.size();







        //this beats 94.70% and 3ms runtime
        // HashMap<Double,Integer> map=new HashMap<>();
        // Arrays.sort(nums);
        // int i=0;
        // int j=nums.length-1;
        // int count=0;
        // while(i<j){
        //     double temp=(nums[i]+nums[j])/2.0;
        //     if(!map.containsKey(temp)){
        //         count++;
        //         map.put(temp,1);
        //     }
        //     i++;
        //     j--;
        // }
        // return count;
    }
}