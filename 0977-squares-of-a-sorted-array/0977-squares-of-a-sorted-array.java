class Solution {
    public int[] sortedSquares(int[] nums) {
        int n=nums.length;
        int[] arr=new int[n];
        int j=n-1;
        int i=0;
        int k=n-1;
        while(i<=j){
            int num1=nums[i]*nums[i];
            int num2=nums[j]*nums[j];
            if(num1<num2){
                arr[k]=num2;
                j--;
            }
            else{
                arr[k]=num1;
                i++;
            }
            k--;
        }
        return arr;

        
    }
}