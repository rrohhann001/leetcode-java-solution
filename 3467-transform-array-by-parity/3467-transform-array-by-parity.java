class Solution {
    public int[] transformArray(int[] nums) {
        int[] arr=new int[nums.length];
        int j=0;
        int k=nums.length-1;
        for(int i=0;i<nums.length;i++){
            if(nums[i]%2==0){
                arr[j]=0;
                j++;
            }
            else{
                arr[k]=1;
                k--;
            }
        }

        return arr;
        
    }
}