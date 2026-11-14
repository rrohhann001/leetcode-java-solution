class Solution {
    public int[] answerQueries(int[] nums, int[] queries) {
        //this is my approch that beats 12.69% and 12ms runtime(brute force approch) 
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
                    break;
                }
                else if(sum<=temp){
                    count++;
                }
            }
            ans[i]=count;
            
        }
        return ans;
        
    }
}