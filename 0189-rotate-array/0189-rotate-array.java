class Solution {
    private void reverse(int[] arr,int start, int end){
        while(start<end){
            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            end--;
            start++;
        }
    }
    public void rotate(int[] nums, int k) {
        int n=nums.length;
        if(n==0||n==1){
            return;
        }
        k=k%n;
        reverse(nums,0,n-1);
        reverse(nums,0,k-1);
        reverse(nums,k,n-1);
       









        //first approch that beats 47.38% and 5ms runtime 
        // int n=nums.length;
        // if(n==0||n==1){
        //     return;
        // }
        // k=k%n;
        // int[] arr=new int[k];
        // int temp=k;
        // int i=0;
        // while(temp>0){
        //     arr[i]=nums[n-temp];
        //     temp--;
        //     i++;
        // }

        // i=n-1;
        // while((i-k)>=0){
        //     nums[i]=nums[i-k];
        //     i--;
        // }

        // i=0;
        // while(i<k){
        //     nums[i]=arr[i];
        //     i++;
        // }

        //and meri second approch jis mai mai ek ek kar ke rotate kar raha hun

    }
}