class Solution {
    public int maxProduct(int[] nums) {
        //brute force
        // int ans=nums[0];
        // int n=nums.length;
        // for(int i=0;i<n;i++){
        //     int temp=1;
        //     for(int j=i;j<n;j++){
        //         temp*=nums[j];
        //         if(temp>ans){
        //             ans=temp;
        //         }
        //     }
        // }
        // return ans;

        //optimed  ye logic samajh mai nahi aaya jara bhi dobar dekhna hai(sir ka cpy)
        int n=nums.length;
        int minProduct=nums[0];
        int maxProduct=nums[0];
        int ans=nums[0];
        for(int i=1;i<n;i++){
            int num=nums[i];
            if(num<0){
                int temp=maxProduct;
                maxProduct=minProduct;
                minProduct=temp;
            }
            maxProduct=Math.max(num,maxProduct*num);
            minProduct=Math.min(num,minProduct*num);
            ans=Math.max(ans,maxProduct);
            
        }
        return ans;
        
    }
}