class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> result=new ArrayList<>();
        int n=1<<nums.length;
        for(int i=0;i<n;i++){
            List<Integer> ans=new ArrayList<>();
            for(int j=0;j<nums.length;j++){
                if((i&(1<<j))!=0){
                    ans.add(nums[j]);
                }
            }
            result.add(ans);
        }
        return result;
        
    }
}