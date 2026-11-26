class Solution {
    public int countPairs(List<Integer> nums, int target) {
        //brute force
        int count=0;
        int n=nums.size();
        for(int i=0;i<n;i++){
            int temp=nums.get(i);
            for(int j=i+1;j<n;j++){
                if(temp+nums.get(j)<target){
                    count++;
                }
            }
        }
        return count;
        
    }
}