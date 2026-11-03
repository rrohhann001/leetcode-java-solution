class Solution {
    public int[] productExceptSelf(int[] nums) {
        //brute force
        //time limit exceed
        // int[] result=new int[nums.length];
        // for(int i=0;i<nums.length;i++){
        //     int temp=1;
        //     for(int j=0;j<nums.length;j++){
        //         if(j==i){
        //             continue;
        //         }
        //         temp=temp*nums[j];
        //     }
        //     result[i]=temp;
        // }
        // return result;

        //this 2 approch optimal
        // T.C=O(n) and S.C=O(n)
        // int n=nums.length;
        // int[] result=new int[n];
        // int[] prefix=new int[n];
        // int[] suffix=new int[n];
        
        // prefix[0]=1;
        // for(int i=1;i<n;i++){
        //     prefix[i]=prefix[i-1]*nums[i-1];
        // }

        // suffix[n-1]=1;
        // for(int i=n-2;i>=0;i--){
        //     suffix[i]=suffix[i+1]*nums[i+1];
        // }

        // for(int i=0;i<n;i++){
        //     result[i]=prefix[i]*suffix[i];
        // }
        // return result;

        int n=nums.length;
        int[] result=new int[n];

        // Step 1: Store prefix products
        result[0]=1;
        for(int i=1;i<n;i++){
            result[i]=result[i-1]*nums[i-1];
        }

        // Step 2: Multiply by suffix products
        int suffix=1;
        for(int i=n-1;i>=0;i--){
            result[i]=result[i]*suffix;
            suffix*=nums[i];
        }
        return result;




        
    }
}