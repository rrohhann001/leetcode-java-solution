class Solution {
    public int findGCD(int[] nums) {
        int smallest=Integer.MAX_VALUE;
        int largest=Integer.MIN_VALUE;
        for(int num:nums){
            if(smallest>num){
                smallest=num;
            }
            if(largest<num){
                largest=num;
            }
        }
        while(smallest>0){
            int remainder=largest%smallest;
            largest=smallest;
            smallest=remainder;
        }
        return largest;
        
    }
}