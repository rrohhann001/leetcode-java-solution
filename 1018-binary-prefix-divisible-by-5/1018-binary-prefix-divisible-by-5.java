class Solution {
    public List<Boolean> prefixesDivBy5(int[] nums) {
        int curr=0;
        int n=nums.length;
        List<Boolean> result=new ArrayList<>();
        for(int i=0;i<n;i++){
            curr=((curr<<1)|nums[i])%5;
            if(curr%5==0){
                result.add(true);
            }
            else{
                result.add(false);
            }
            
        }
        return result;
        
    }
}