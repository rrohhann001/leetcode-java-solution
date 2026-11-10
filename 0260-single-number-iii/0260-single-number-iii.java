class Solution {
    public int[] singleNumber(int[] nums) {
        //brute force type approch but this is not efficient 15.20% beats , 8ms speed
        // Arrays.sort(nums);
        // int i=0;
        // int j=1;
        // int[] result=new int[2];
        // int count=0;
        // while(i<j && j<nums.length){
        //     if(nums[i]==nums[j]){
        //         i=j+1;
        //         j=i+1;
        //     }
        //     else{
        //         result[count]=nums[i];
        //         i++;
        //         j++;
        //         count++;
        //     }
        // }
        // if(i<nums.length){
        //     result[count]=nums[i];
        // }
        // return result;

        //second an optimized approch
        int[] result=new int[2];
        int temp=0;
        for(int num:nums){
            temp^=num;
        }

        //find first set bit
        // int bit=1;
        // while((temp&bit)==0){
        //     bit=bit<<1;
        // }
        //ish ki jagha ye bhi kar sakte hai

        //(temp&(temp-1)ish se right most bit unset ho jata hai and fir ush ka xor
        int mask=(temp&(temp-1))^temp;

        //then perform XOR base on 2 cases, 1 case where bit is 1 and 2 case whre bit is 0
        for(int num: nums){
            if((num&mask)!=0){
                result[0]^=num;
            }
            else{
                result[1]^=num;
            }
        }
        return result;
        
    }
}