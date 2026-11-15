class Solution {
    public int maxDivScore(int[] nums, int[] divisors) {
        int maxScore=0;
        int result=divisors[0];
        for(int divis:divisors){
            int score=0;
            for(int i=0;i<nums.length;i++){
                if(nums[i]%divis==0){
                    score++;
                }
            }
            if(score==maxScore && result>divis){
                result=divis;
            }
            else if(score>maxScore){
                maxScore=score;
                result=divis;
            }

        }
        return result;
        
    }
}