class Solution {
    public int[] answerQueries(int[] nums, int[] queries) {
        int n=nums.length;
        int m=queries.length;
        Arrays.sort(nums);
        int[] ans=new int[m];
        for(int i=0;i<m;i++){
            int temp=queries[i];
            int count=0;
            int sum=0;
            for(int j=0;j<n;j++){
                sum+=nums[j];
                if(sum>temp){
                    sum=sum-nums[j];
                }
                else if(sum<=temp){
                    count++;
                    if(count>ans[i]){
                        ans[i]=count;
                    }
                }
            }
            
        }
        return ans;
        
    }
}