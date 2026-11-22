class Solution {
    public List<Integer> majorityElement(int[] nums) {
        List<Integer> result=new ArrayList<>();
        int n=nums.length;
        Arrays.sort(nums);
        int curr=nums[0];
        int i=1;
        int count=1;
        while(i<n){
            if(curr==nums[i]){
                count++;
            }
            else{
                if(count>n/3){
                    result.add(curr);
                }
                curr=nums[i];
                count=1;
            }
            i++;
        }
        if(count>n/3){
            result.add(curr);
        }
        return result;
        
    }
}