class Solution {
    public void rotate(int[] nums, int k) {
        int n=nums.length;
        // if(n==0||n==1){
        //     return;
        // }
        k=k%n;
        int[] arr=new int[k];
        int temp=k;
        int i=0;
        while(temp>0){
            arr[i]=nums[n-temp];
            temp--;
            i++;
        }

        i=n-1;
        while((i-k)>=0){
            nums[i]=nums[i-k];
            i--;
        }

        i=0;
        while(i<k){
            nums[i]=arr[i];
            i++;
        }

    }
}