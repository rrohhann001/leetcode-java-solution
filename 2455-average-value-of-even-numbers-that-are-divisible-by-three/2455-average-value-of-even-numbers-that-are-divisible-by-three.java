class Solution {
    public int averageValue(int[] nums) {
        int sum=0;
        int count=0;
        for(int n:nums){
            if((n&1)==0&&(n%3==0)){
                sum+=n;
                count++;
            }
        }
        if(count==0){
            return 0;
        }
        return sum/count;
        
    }
}