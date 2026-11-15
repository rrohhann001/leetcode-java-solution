class Solution {
    public List<Boolean> prefixesDivBy5(int[] nums) {
        int val=0;
        List<Boolean> result=new ArrayList<>();
        for(int n:nums){
            val=((val<<1)+n)%5;
            if(val%5==0){
                result.add(true);
            }
            else{
                result.add(false);
            }
            
        }
        return result;
        
    }
}