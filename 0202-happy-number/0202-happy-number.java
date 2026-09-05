class Solution {
    public boolean isHappy(int n) {

     // 1ms runtime beats 77.82
    //     long ans=n;
    //     int count=0;
    //     while(ans!=1){
    //         long digit=0;
    //         long res=0;

    //         while(ans!=0){
    //             digit=ans%10;
    //             ans=ans/10;
    //             res=digit*digit+res;
    //             if(res>Integer.MAX_VALUE){
    //                 return false;
    //             }
    //         }
    //         count++;
    //         if(res>1 && res<10&& count>1){
    //             return false;
    //         }
    //         ans=res;
    //     }
    //    return true;

        while(n!=1&& n!=4){
            int sum=0;
            while(n>0){
                int digit=n%10;
                sum+=digit*digit;
                n=n/10;
            }
        n=sum;
        }
        return n==1;
        
    }
}